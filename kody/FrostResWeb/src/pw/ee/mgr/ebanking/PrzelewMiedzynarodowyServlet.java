package pw.ee.mgr.ebanking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.w3c.dom.NodeList;

import pw.ee.mgr.ebanking.domain.ZleceniePrzelewuMiedzynarodowegoInput;
import pw.ee.mgr.ebanking.ws.BasicWS;
import pw.ee.mgr.ebanking.ws.PrzelewMiedzynarodowyWS;
import pw.ee.mgr.ebanking.ws.PrzelewMiedzynarodowyWSConnector;

/**
 * Servlet implementation class PrzelewMiedzynarodowyServlet
 */
public class PrzelewMiedzynarodowyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrzelewMiedzynarodowyServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		System.out.println("Odebrano GET na zlecenie przelewu miêdzynarodowego");
		String kwota = request.getParameter("kwota");
		String nrRachunkuNadawcy = request.getParameter("nrRachunkuNadawcy");
		String nrRachunkuOdbiorcy = request.getParameter("nrRachunkuOdbiorcy");
		String kodKraju = request.getParameter("kodKraju");
		String waluta = request.getParameter("waluta");
		String przelicznik = request.getParameter("przelicznik");
		String tytul = request.getParameter("tytul");
		String opis = request.getParameter("opis");
					
		if (kwota == null || nrRachunkuNadawcy == null || nrRachunkuOdbiorcy == null) {
			writer.write("Nie podano kwoty, nr rachunku odbiorcy lub nr rachunku nadawcy");
			return;
		}
		
		ZleceniePrzelewuMiedzynarodowegoInput zlecenieInput = new ZleceniePrzelewuMiedzynarodowegoInput();
		zlecenieInput.setKodKraju(kodKraju);
		zlecenieInput.setKwota(kwota);
		zlecenieInput.setNrRachunkuNadawcy(nrRachunkuNadawcy);
		zlecenieInput.setNrRachunkuOdbiorcy(nrRachunkuOdbiorcy);
		zlecenieInput.setOpis(opis);
		zlecenieInput.setPrzelicznik(przelicznik);
		zlecenieInput.setTytul(tytul);
		zlecenieInput.setWaluta(waluta);
		
		System.out.println("Otwieranie polaczenia do socketa");
		PrzelewMiedzynarodowyWSConnector wsConn = new PrzelewMiedzynarodowyWSConnector();
		wsConn.createConnection();
		URL endpoint = null;

		if ((endpoint = wsConn.getConnectionURL()) == null) {
			System.err.println("Connection to endpoint is not valid.");
			writer.write("[FrostResWeb] Problem z polaczeniem do punktu koncowego");
			return;
		}
		
		BasicWS soapConnector = new BasicWS();
		PrzelewMiedzynarodowyWS com = new PrzelewMiedzynarodowyWS();
		SOAPConnection soapConnection = soapConnector.getSoapConnection();
		SOAPMessage soapResponse = null;
		try {
			soapResponse = soapConnection.call(com.createConfirmationOrderMessage(zlecenieInput), endpoint);
			if(soapResponse == null  || soapResponse.getContentDescription() == ""){
				System.err.println("Incorrect response message returned from service.");
				writer.write("Brak odpowiedzi z przetworzonego zlecenie przelewu");
				return;
			}else{
				writer.write("Status transakcji przelewu miêdzynarodowego: ");
				SOAPPart part = soapResponse.getSOAPPart();
				SOAPEnvelope env = part.getEnvelope();
				SOAPBody body = env.getBody();
				
				if (body.hasFault()) {
					writer.write("Niepoprawne body odpowiedzi");
				} else {
					int firstItem = 0;
					NodeList bodyElements = body.getChildNodes();
					NodeList confirmOrderResponseElements = bodyElements.item(firstItem).getChildNodes();
					NodeList confirmOrderOutputElements = confirmOrderResponseElements.item(firstItem).getChildNodes();
					NodeList resultElements = confirmOrderOutputElements.item(firstItem).getChildNodes();
					Node result = (Node) resultElements.item(firstItem);
					String resultVal = result.getTextContent();
					writer.write(resultVal);
				}
			}
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

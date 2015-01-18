package pw.ee.mgr.ebanking.ws;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import pw.ee.mgr.ebanking.domain.ZleceniePrzelewuMiedzynarodowegoInput;
import pw.ee.mgr.ebanking.helper.ProcesowaniePrzelewuException;

public class PrzelewMiedzynarodowyWS extends BasicWS {

	public PrzelewMiedzynarodowyWS() {
		super();
	}

	public SOAPMessage createConfirmationOrderMessage(
			ZleceniePrzelewuMiedzynarodowegoInput zlecenieInput) {
		SOAPMessage soapMessage = null;
		try {
			soapMessage = createBasicSoapMessage();
			soapMessage.setProperty (SOAPMessage.CHARACTER_SET_ENCODING, "UTF-8");
			SOAPBody soapBody = soapMessage.getSOAPBody();
			QName qConfirmOrderName = new QName("http://Main/ServicesIdentification/ObslugaPrzelewow/",
					"inicjujZleceniePrzelewuMiedzynarodowego", "obs");
			SOAPBodyElement bodyElement = soapBody.addBodyElement(qConfirmOrderName);
			QName qZleceniePrzelewuInputName = new QName("zlecenie");
		    SOAPElement zleceniePrzelewuInputElement = bodyElement.addChildElement(qZleceniePrzelewuInputName);
		    
		    QName qKwota = new QName("kwota");
		    SOAPElement kwotaElem = zleceniePrzelewuInputElement.addChildElement(qKwota);
		    kwotaElem.addTextNode(zlecenieInput.getKwota());
		    
		    QName qNrRachNadawcy = new QName("nrRachNadawcy");
		    SOAPElement nrRachNadawcyElem = zleceniePrzelewuInputElement.addChildElement(qNrRachNadawcy);
		    nrRachNadawcyElem.addTextNode(zlecenieInput.getNrRachunkuNadawcy());
		    
		    QName qNrRachOdbiorcy = new QName("nrRachOdbiorcy");
		    SOAPElement nrRachOdbiorcyElem = zleceniePrzelewuInputElement.addChildElement(qNrRachOdbiorcy);
		    nrRachOdbiorcyElem.addTextNode(zlecenieInput.getNrRachunkuOdbiorcy());
		    
		    QName qWaluta = new QName("waluta");
		    SOAPElement walutaElem = zleceniePrzelewuInputElement.addChildElement(qWaluta);
		    walutaElem.addTextNode(zlecenieInput.getWaluta());

		    QName qPrzelicznik = new QName("przelicznik");
		    SOAPElement przelicznikElem = zleceniePrzelewuInputElement.addChildElement(qPrzelicznik);
		    przelicznikElem.addTextNode(zlecenieInput.getPrzelicznik());
		    
		    QName qKodKraju = new QName("kodKraju");
		    SOAPElement kodKrajuElem = zleceniePrzelewuInputElement.addChildElement(qKodKraju);
		    kodKrajuElem.addTextNode(zlecenieInput.getKodKraju());
		    
		    QName qTytul = new QName("tytul");
		    SOAPElement tytulElem = zleceniePrzelewuInputElement.addChildElement(qTytul);
		    tytulElem.addTextNode(zlecenieInput.getTytul());
		    
		    QName qOpis = new QName("opis");
		    SOAPElement opisElem = zleceniePrzelewuInputElement.addChildElement(qOpis);
		    opisElem.addTextNode(zlecenieInput.getOpis());
		    
		} catch (SOAPException e) {
			throw new ProcesowaniePrzelewuException(
					"Technical problem with application functioning.");
		}
		return soapMessage;
	}
}

package pw.ee.mgr.ebanking.ws;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import pw.ee.mgr.ebanking.helper.SOAPMessageBuilderException;

public class BasicWS {

	private SOAPConnection soapConnection;
	private SOAPMessage soapMessage;
	private SOAPEnvelope soapEnvelope;

	public BasicWS() {
		try {
			SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory.newInstance();
			this.soapConnection = soapConnFactory.createConnection();
		} catch (SOAPException e) {
			throw new SOAPMessageBuilderException("Problem with service connection");
		}
	}
	public SOAPConnection getSoapConnection() {
		return soapConnection;
	}

	public SOAPMessage getSoapMessage() {
		return soapMessage;
	}

	public SOAPEnvelope getSoapEnvelope() {
		return soapEnvelope;
	}

	public void setSoapEnvelope(SOAPEnvelope soapEnvelope) {
		this.soapEnvelope = soapEnvelope;
	}

	protected SOAPMessage createBasicSoapMessage() throws SOAPException {
		MessageFactory messageFactory = MessageFactory.newInstance();
		this.soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		this.soapEnvelope = soapPart.getEnvelope();
		this.soapEnvelope.addNamespaceDeclaration("env",
				"http://schemas.xmlsoap.org/soap/envelop/");

		return soapMessage;
	}
}

package pw.ee.mgr.ebanking.ws;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import pw.ee.mgr.ebanking.helper.WSConnectorException;


public class WSConnector {
	
	protected String endpoint;
	protected URL url;
	protected URLConnection urlConnection;
	
	public int CONN_TIMEOUT = 2000;
	public int READ_TIMEOUT = 3000;
	public String PRZELEW_MIEDZYNARODOWY_ENDPOINT = "http://localhost:9084/EBankingModuleWeb/sca/ObslugaPrzelewowWSEksport";
	
	protected WSConnector() {
		this.urlConnection = null;
	}
	
	public void createConnection(){
		try {
			this.endpoint = PRZELEW_MIEDZYNARODOWY_ENDPOINT;
			this.url = new URL(this.endpoint);
			System.out.println("Otwieranie polaczenia do punktu koncowego");
			this.urlConnection = url.openConnection();
				if(this.urlConnection == null)
					throw new WSConnectorException("Connection web service problem.");
				else
					System.out.println("Application correctly connected: " + this.endpoint);
			this.urlConnection.setConnectTimeout(CONN_TIMEOUT);
			this.urlConnection.setReadTimeout(READ_TIMEOUT);
		} catch (WSConnectorException ex){
			System.err.println("Problem with openning connection to given endpoint.");
		} catch (MalformedURLException e1) {
			System.err.println("Incorrect '" + this.endpoint + "' endpoint given.");
		} catch (IOException e) {
			System.err.println("Problem with using connection to given endpoint '" + this.endpoint + "' .");
			throw new WSConnectorException("Connection IO service problem.");
		}
	}
	
	public URL getConnectionURL(){
		return this.url;
	}
	
	public void sendMessage(String message){
		if(this.urlConnection == null){
			throw new WSConnectorException("Connection web service problem.");
		}
		
    	OutputStreamWriter out;
		try {
			out = new OutputStreamWriter(this.urlConnection.getOutputStream()); 
			out.write(message);
			out.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

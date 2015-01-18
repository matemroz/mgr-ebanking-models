package pw.ee.mgr.ebanking.rozliczenia;



@javax.jws.WebService (endpointInterface="pw.ee.mgr.ebanking.rozliczenia.ZarzadzanieRozliczeniami", targetNamespace="http://Main/ServicesIdentification/ZarzadzanieRozliczeniami/", serviceName="ZarzadzanieRozliczeniamiService", portName="ZarzadzanieRozliczeniamiServicePort")
public class ZarzadzanieRozliczeniamiBindingImpl{

    public void inicjujRejestracjeKwotyPrzelewuMiedzynarodowegoWSystemieRozliczen(ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Inicjalizacja rejestracji kowty przleewu miêdzynarodowego");
        return;
    }

    public void zlecRejestracjeKwotyPrzelewuMiedzynarodowegoWSystemieRozliczen(ZleceniePrzelewuMiedzynarodowego zlecenie) {
    	System.out.println("Zlecenie rejestracji kwoty przelewu miêdznarodowego");
        return;
    }

}
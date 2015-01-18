package pw.ee.mgr.ebanking.operacjebankowe;



@javax.jws.WebService (endpointInterface="pw.ee.mgr.ebanking.operacjebankowe.ZarzadzanieOperacjamiBankowymi", targetNamespace="http://Main/ServicesIdentification/ZarzadzanieOperacjamiBankowymi/", serviceName="ZarzadzanieOperacjamiBankowymiService", portName="ZarzadzanieOperacjamiBankowymiServicePort")
public class ZarzadzanieOperacjamiBankowymiBindingImpl{

    public void inicjujPrzewalutowywaniePrzelewuMiedzynarodowego(ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Inicjalizacja przewalutowania przelewu międzynarodowego");
        return;
    }

    public void inicjujWykonaniePrzelewu(StatusZleceniaPrzelewu statusZlecenia, ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Inicjalizacja wykonania przelewu");
        return;
    }

    public void inicjujZakonczenieProcesowaniaPrzelewuMiedzynarodowego(StatusZleceniaPrzelewu status) {
        System.out.println("Inicjalizacja zakonczenia przelewu międzynarodowego");
        return;
    }

    public void wplacPieniadzeNaKonto(String nrKonta, double kwota) {
        System.out.println("Wpłacanie pieniędzy na konto");
        return;
    }

    public void wyplacPieniadzeZKonta(double kwota, String nrKonta) {
        System.out.println("Wypłacanie pieniędzy z konta");
        return;
    }

}
package pw.ee.mgr.ebanking.operacjebankowe;



@javax.jws.WebService (endpointInterface="pw.ee.mgr.ebanking.operacjebankowe.ZarzadzanieOperacjamiBankowymi", targetNamespace="http://Main/ServicesIdentification/ZarzadzanieOperacjamiBankowymi/", serviceName="ZarzadzanieOperacjamiBankowymiService", portName="ZarzadzanieOperacjamiBankowymiServicePort")
public class ZarzadzanieOperacjamiBankowymiBindingImpl{

    public void inicjujPrzewalutowywaniePrzelewuMiedzynarodowego(ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Inicjalizacja przewalutowania przelewu mi�dzynarodowego");
        return;
    }

    public void inicjujWykonaniePrzelewu(StatusZleceniaPrzelewu statusZlecenia, ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Inicjalizacja wykonania przelewu");
        return;
    }

    public void inicjujZakonczenieProcesowaniaPrzelewuMiedzynarodowego(StatusZleceniaPrzelewu status) {
        System.out.println("Inicjalizacja zakonczenia przelewu mi�dzynarodowego");
        return;
    }

    public void wplacPieniadzeNaKonto(String nrKonta, double kwota) {
        System.out.println("Wp�acanie pieni�dzy na konto");
        return;
    }

    public void wyplacPieniadzeZKonta(double kwota, String nrKonta) {
        System.out.println("Wyp�acanie pieni�dzy z konta");
        return;
    }

}
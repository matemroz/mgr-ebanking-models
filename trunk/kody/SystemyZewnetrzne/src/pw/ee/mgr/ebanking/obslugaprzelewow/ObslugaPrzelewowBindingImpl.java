package pw.ee.mgr.ebanking.obslugaprzelewow;



@javax.jws.WebService (endpointInterface="pw.ee.mgr.ebanking.obslugaprzelewow.ObslugaPrzelewow", targetNamespace="http://Main/ServicesIdentification/ObslugaPrzelewow/", serviceName="ObslugaPrzelewowService", portName="ObslugaPrzelewowServicePort")
public class ObslugaPrzelewowBindingImpl{

    public void inicjujZleceniePrzelewuKrajowego(StatusZleceniaPrzelewu statusZlecenia, ZleceniePrzelewuKrajowego zleceniePrzelewuKrajowego) {
        System.out.println("Inicjalizacja przelewu krajowego");
        return;
    }

    public void inicjujZleceniePrzelewuMiedzynarodowego(ZleceniePrzelewuMiedzynarodowego zlecenie, StatusZleceniaPrzelewu statusZlecenia) {
        System.out.println("Inicjalizacja przelewu miêdzynarodowego");
        return;
    }

    public boolean notyfikacjaOZakonczeniuProcesowaniaPrzelewuMiedzynarodowego() {
        System.out.println("Zakonczenie procesowania przelewu miedzynarodowego");
        return false;
    }
}
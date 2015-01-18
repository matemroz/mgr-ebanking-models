package pw.ee.mgr.ebanking.weryfikator;

@javax.jws.WebService (endpointInterface="pw.ee.mgr.ebanking.weryfikator.KontrolaPrzeplywowFinansowych", targetNamespace="http://Main/ServicesIdentification/KontrolaPrzeplywowFinansowych/", serviceName="KontrolaPrzeplywowFinansowychService", portName="KontrolaPrzeplywowFinansowychServicePort")
public class KontrolaPrzeplywowFinansowychWSImpl{

    public void inicjujWykonaniePrzelewu(ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Pomyslnie zainicjowano wykonanie przelewu");
        return;
    }

    public WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego weryfikacjaMozliwosciWykonaniaPrzelewuMiedzynarodowego(ZleceniePrzelewuMiedzynarodowego zlecenie) {
        System.out.println("Rozpoczeto weryfikacje mozliwosci wykonania przelewu miedzynarodowego");
    	WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego wynik = new WynikWeryfikacjiMozliwosciWykonaniaPrzelewuMiedzynarodowego();
        
    	double przelicznik = Double.parseDouble(zlecenie.getPrzelicznik());
    	
    	if(przelicznik < 0.0 || przelicznik > 5.99) {
        	System.err.println("Nie wszystkie wymagane wartosci zlecenia przelewu miedzynarodowego zostaly podane");
        	wynik.setCzyMozliwyPrzelewMiedzynarodowy("NIE");
        	wynik.setOpis("Niepoprawne dane przelewu");
        	return wynik;
        }
        wynik.setCzyMozliwyPrzelewMiedzynarodowy("TAK");
        wynik.setOpis("Przelew możliwy do wykonania");
        return wynik;
    }

    public WynikWeryfikacjiZleceniaPrzelewu weryfikujZleceniePrzelewuMiedzynarodowego(ZleceniePrzelewuMiedzynarodowego zlecenie) {
    	System.out.println("Rozpoczeto weryfikacje zlecenia przelewu miedzynarodowego");
    	WynikWeryfikacjiZleceniaPrzelewu wynik = new WynikWeryfikacjiZleceniaPrzelewu();
        if(zlecenie.getKodKraju() == null || zlecenie.getKwota() == null || zlecenie.getNrRachNadawcy() == null || zlecenie.getNrRachOdbiorcy() == null ||
        		zlecenie.getOpis() == null || zlecenie.getPrzelicznik() == null || zlecenie.getTytul() == null || zlecenie.getWaluta() == null || zlecenie.getKodKraju().equals("") 
        		|| zlecenie.getKwota().equals("") || zlecenie.getNrRachNadawcy().equals("") || zlecenie.getNrRachOdbiorcy().equals("") ||
        		zlecenie.getOpis().equals("") || zlecenie.getPrzelicznik().equals("") || zlecenie.getTytul().equals("") || zlecenie.getWaluta().equals("")) {
        	System.out.println("Nie wszystkie wymagane wartosci zostaly ustawione");
        	wynik.setWynik("NIEPOPRAWNY");
        	wynik.setOpis("Dane przelewu zweryfikowano negatywnie");
        	return wynik;
        }
        System.out.println("Zlecenie przelewu zweryfikowane pozytywnie");
        wynik.setWynik("POPRAWNY");
        wynik.setOpis("Dane przelewu zweryfikowano pozytywnie");
        return wynik;
    }
}
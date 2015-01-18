package pw.ee.mgr.ebanking.domain;

public class ZleceniePrzelewuMiedzynarodowegoInput {

	private String kwota;
	private String nrRachunkuNadawcy;
	private String nrRachunkuOdbiorcy;
	private String kodKraju;
	private String waluta;
	private String przelicznik;
	private String tytul;
	private String opis;

	public String getKwota() {
		return kwota;
	}

	public void setKwota(String kwota) {
		this.kwota = kwota;
	}

	public String getNrRachunkuNadawcy() {
		return nrRachunkuNadawcy;
	}

	public void setNrRachunkuNadawcy(String nrRachunkuNadawcy) {
		this.nrRachunkuNadawcy = nrRachunkuNadawcy;
	}

	public String getNrRachunkuOdbiorcy() {
		return nrRachunkuOdbiorcy;
	}

	public void setNrRachunkuOdbiorcy(String nrRachunkuOdbiorcy) {
		this.nrRachunkuOdbiorcy = nrRachunkuOdbiorcy;
	}

	public String getKodKraju() {
		return kodKraju;
	}

	public void setKodKraju(String kodKraju) {
		this.kodKraju = kodKraju;
	}

	public String getWaluta() {
		return waluta;
	}

	public void setWaluta(String waluta) {
		this.waluta = waluta;
	}

	public String getPrzelicznik() {
		return przelicznik;
	}

	public void setPrzelicznik(String przelicznik) {
		this.przelicznik = przelicznik;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
}

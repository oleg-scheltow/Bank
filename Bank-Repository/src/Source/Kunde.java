package Source;

import java.util.ArrayList;

public class Kunde {
	private String vname;
	private String nname;

	private long kundenNummer;

	private ArrayList<Konto> kontoListe = new ArrayList<Konto>();

	public Kunde(String vname, String nname, long kundenNummer) {
		this.vname = vname;
		this.nname = nname;
		this.kundenNummer = kundenNummer;
	}

	public Konto anlegenKonto(KontoTyp kontoTyp) {
		Konto konto;
		if(kontoTyp == KontoTyp.GIROKONTO){
			konto = new Girokonto(kundenNummer, kontoTyp);
		}else{
			konto = new Sparkonto(kundenNummer, kontoTyp);
		}
		kontoListe.add(konto);

		return konto;
	}

	public String anzeigenKontostandsUebersicht() {
		String kontoUebersicht = "\n";

		for (Konto konto : kontoListe) {
			kontoUebersicht = kontoUebersicht + "Kontonummer " + konto.getKontoNummer() + "| Betrag:"
					+ konto.getBetrag() + "\n";
		}

		return kontoUebersicht;
	}

	// public String auszahlenBetrag(double betrag, long kontonummer)
	// {
	//
	// return abetrag;
	// }
	//
	// public void einzahlenBetrag(double betrag, long kontonummer)
	// {
	// //TODO einzahlen
	// }
	//
	public String getVname() {
		return this.vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public long getKundennummer() {
		return this.kundenNummer;
	}

	public void setKundennummer(long kundenNummer) {
		this.kundenNummer = kundenNummer;
	}

	public ArrayList<Konto> getKontoliste() {
		return this.kontoListe;
	}

	public void setKontoliste(ArrayList<Konto> kontoliste) {
		this.kontoListe = kontoliste;
	}

}

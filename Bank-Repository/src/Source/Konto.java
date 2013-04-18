package Source;

import java.util.Date;

import Exceptions.KontoLeerException;

public class Konto {

	protected KontoBewegung kontoBewegung = new KontoBewegung();
	protected long kontoNummer;
	protected double kontoStand;
	protected KontoTyp kontoArt;
	protected static int index =0;
	
	
	public Konto() {
	}

	public Konto(long kundenNummer,KontoTyp kontoArt){
		kontoBewegung= new KontoBewegung();
		kontoNummer=((kundenNummer*100)+kontoArt.wert)*10000+index;
		index++;
		kontoStand=0;
		this.kontoArt=kontoArt;
	}
	
	@Override 
	public boolean equals(Object obj){
		Konto konto; 
		if (obj instanceof Konto){
			konto = (Konto) obj; 
		}else{
			return false;
		}
		
	if(this.kontoNummer == konto.kontoNummer){
		return true; 
	}else{
		return false;
	}
	}
	

	public void einzahlen(double betrag){
		kontoStand=kontoStand+betrag;
		kontoBewegung.addiereBewegung(new Date(), "+"+betrag);
	}
	
	public void auszahlen(double betrag) throws KontoLeerException {
		kontoStand=kontoStand-betrag;
		kontoBewegung.addiereBewegung(new Date(), "-"+betrag);
	}

	public long getKontoNummer() {
		return kontoNummer;
}

	public double getBetrag() {
		return kontoStand;
	}

	public KontoBewegung getKontoBewegung() {
		return kontoBewegung;
	}

	public void setKontoBewegung(KontoBewegung kontoBewegung) {
		this.kontoBewegung = kontoBewegung;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}

	public KontoTyp getKontoArt() {
		return kontoArt;
	}

	public void setKontoArt(KontoTyp kontoArt) {
		this.kontoArt = kontoArt;
	}

	public void setKontoNummer(long kontoNummer) {
		this.kontoNummer = kontoNummer;
	}
	
	

}

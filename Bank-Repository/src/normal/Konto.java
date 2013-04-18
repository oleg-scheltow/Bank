package normal;

import java.util.Date;

public class Konto {

	public KontoBewegung kontoBewegung = new KontoBewegung();
	public long kontoNummer;
	public double kontoStand;
	public KontoTyp kontoArt;
	public static int index =0;
	
	
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
	
	public void auszahlen(double betrag) {
		kontoStand=kontoStand-betrag;
		kontoBewegung.addiereBewegung(new Date(), "-"+betrag);
	}

	public long getKontoNummer() {
		return kontoNummer;
}

	public double getBetrag() {
		return kontoStand;
	}
	
	

}

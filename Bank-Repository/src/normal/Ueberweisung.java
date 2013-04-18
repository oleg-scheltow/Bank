package normal;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Ueberweisung {
	public static HashMap<Long,ArrayList<String>> kontoListe = new HashMap<Long, ArrayList<String>>();
	private Konto senderKonto; 
	private Konto empfaengerKonto;
	private int betrag;
	private Date date;
	
	public Ueberweisung(Konto konto1, Konto konto2, int betrag, Date date) {
		this.betrag=betrag;
		this.date=date;
		this.senderKonto=konto1;
		this.empfaengerKonto=konto2;
	}

	public void durchfuehrenUeberweisung() {
		ArrayList<String> ueberweisungsListe;
		
		if(kontoListe.containsKey(senderKonto.getKontoNummer())){
			ueberweisungsListe=kontoListe.get(senderKonto.getKontoNummer());
		}else{
			ueberweisungsListe = new ArrayList<String>();
		}
		
		ueberweisungsListe.add(date +": "+senderKonto.getKontoNummer()+" sendet "+betrag + " zu "+empfaengerKonto.getKontoNummer());
		kontoListe.put(senderKonto.getKontoNummer(), ueberweisungsListe);
		
		senderKonto.auszahlen(betrag);
		empfaengerKonto.einzahlen(betrag);
	}

}

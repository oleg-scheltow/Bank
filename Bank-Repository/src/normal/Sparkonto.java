package normal;

import java.util.Date;

public class Sparkonto extends Konto {
	double festzinsVereinbarung = 0;

	public Sparkonto(long kundenNummer, KontoTyp kontoArt) {
		super(kundenNummer, kontoArt);
	}

	@Override
	public void auszahlen(double betrag) {
		if (kontoStand - betrag >= 0) {
			kontoStand = kontoStand - betrag;
			kontoBewegung.addiereBewegung(new Date(), "-" + betrag);
		} else {
			System.out.println("Konnte kann nicht weiter überzogen werden");
		}
	}
}

package Source;

import java.util.Date;

public class Sparkonto extends Konto {
	double festzinsVereinbarung = 0;

	public Sparkonto(long kundenNummer) {
		super(kundenNummer, KontoTyp.SPARKONTO);
	}

	@Override
	public void auszahlen(double betrag) {
		if (kontoStand - betrag >= 0) {
			kontoStand = kontoStand - betrag;
			kontoBewegung.addiereBewegung(new Date(), "-" + betrag);
		} else {
			System.out.println("Konnte kann nicht weiter �berzogen werden");
		}
	}
}

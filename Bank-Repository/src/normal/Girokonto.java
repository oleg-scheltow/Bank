package normal;
import java.util.Date;

public class Girokonto extends Konto {
	double limit = -100;

	public Girokonto(long kundenNummer, KontoTyp kontoArt) {
		super(kundenNummer, kontoArt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void auszahlen(double betrag) {
		if (kontoStand - betrag >= limit) {
			kontoStand = kontoStand - betrag;
			kontoBewegung.addiereBewegung(new Date(), "+" + betrag);
		} else {
			System.out
					.println("Es kann nichts ausgezahlt werden, da der limit erreicht ist");
		}
	}

}

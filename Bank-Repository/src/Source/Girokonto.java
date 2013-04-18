package Source;
import java.util.Date;

import Exceptions.KontoLeerException;

public class Girokonto extends Konto {
	double limit = -100;

	public Girokonto(long kundenNummer) {
		super(kundenNummer, KontoTyp.GIROKONTO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void auszahlen(double betrag) throws KontoLeerException {
		if (kontoStand - betrag >= limit) {
			kontoStand = kontoStand - betrag;
			kontoBewegung.addiereBewegung(new Date(), "+" + betrag);
		} else {
			throw new KontoLeerException("Saldo zu gering");
			
		}
	}

}

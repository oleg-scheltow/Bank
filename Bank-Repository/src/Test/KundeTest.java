package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Source.KontoTyp;
import Source.Kunde;

public class KundeTest {
	
	Kunde kunde;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		kunde = new Kunde("Jochen","Erchi",1234);
	}

	@Test
	public void testAnlegenKonto() {
		assertEquals(0, kunde.getKontoliste().size());
		kunde.anlegenKonto(KontoTyp.GIROKONTO);
		assertEquals(1, kunde.getKontoliste().size());
		kunde.anlegenKonto(KontoTyp.SPARKONTO);
		assertEquals(2, kunde.getKontoliste().size());
		
		assertNotNull(kunde.anlegenKonto(KontoTyp.GIROKONTO));
		
	}

}

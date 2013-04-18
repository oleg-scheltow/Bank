package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.KontoLeerException;
import Source.Konto;

public class KontoTest {

	Konto konto;
	Konto konto2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		konto = new Konto();
		konto2 = new Konto();
	}



	@Test
	public void testEqualsObject() {
		
		konto.setKontoNummer(1234); 
		konto2.setKontoNummer(1234);
		
		assertTrue(konto.equals(konto2));
		
		konto2.setKontoNummer(1236);
		
		assertFalse(konto.equals(konto2));
		
	}

	@Test
	public void testEinzahlen() {
		assertEquals(0, konto.getKontoStand()+0,0);
		konto.einzahlen(50);
		assertEquals(50, konto.getKontoStand()+0,0);
		konto.einzahlen(50);
		assertEquals(100, konto.getKontoStand()+0,0);
	}

	@Test
	public void testAuszahlen() {
		konto.setKontoStand(100);
		assertEquals(100, konto.getKontoStand()+0,0);
		try {
			konto.auszahlen(50);
		} catch (KontoLeerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		assertEquals(50, konto.getKontoStand()+0,0);
		try {
			konto.auszahlen(25);
		} catch (KontoLeerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(25, konto.getKontoStand()+0,0);
		
	}

}

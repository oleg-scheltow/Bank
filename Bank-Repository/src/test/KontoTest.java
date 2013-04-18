package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		
		konto.kontoNummer = 1234; 
		konto2.kontoNummer = 1234;
		
		assertTrue(konto.equals(konto2));
		
		konto2.kontoNummer = 1236;
		
		assertFalse(konto.equals(konto2));
		
	}

	@Test
	public void testEinzahlen() {
		assertEquals(0, konto.kontoStand+0,0);
		konto.einzahlen(50);
		assertEquals(50, konto.kontoStand+0,0);
		konto.einzahlen(50);
		assertEquals(100, konto.kontoStand+0,0);
	}

	@Test
	public void testAuszahlen() {
		konto.kontoStand = 100;
		assertEquals(100, konto.kontoStand+0,0);
		konto.auszahlen(50); 
		assertEquals(50, konto.kontoStand+0,0);
		konto.auszahlen(25);
		assertEquals(25, konto.kontoStand+0,0);
		
	}

}

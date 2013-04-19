package Test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.KontoLeerException;
import Source.Girokonto;
import Source.Konto;

public class GirokontoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testAuszahlen(){
		Girokonto frank = new Girokonto(1236);
		
		
		
	}

}



import Source.Konto;

public class testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Konto konto = new Konto();
		Konto konto2 = new Konto();
		
		konto.setKontoNummer(1234); 
		konto2.setKontoNummer(1234);
		
		if (konto.equals(konto2)){
			System.out.println("ist gleich");
		}else{
			System.out.println("ist ungleich");
		}
				
	}

}

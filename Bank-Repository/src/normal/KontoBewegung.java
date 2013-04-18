package normal;

import java.util.ArrayList;
import java.util.Date;

public class KontoBewegung {

	public ArrayList<String> bewegungen = new ArrayList<String>();
	
	public KontoBewegung(){			
	}
	
	public void addiereBewegung(Date date,String betrag){
		bewegungen.add("Datum:" + date + betrag);
	}


}

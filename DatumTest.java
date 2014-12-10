public class DatumTest {
	
	public static void main(String[] args) {
	
		Datum prviDatum = new Datum(10, 12, 2014);
		Datum drugiDatum =new Datum(10,12,2014);
		
		
		
		System.out.println(prviDatum.toString());
		System.out.println(prviDatum.getDan());
		System.out.println(prviDatum.getMjesec());
		System.out.println(prviDatum.getGodina());
		
		
		
	//	prviDatum.setDan(22);
		//System.out.println(prviDatum.getDan());
		
		//System.out.println(drugiDatum.toString());
		
		//if (prviDatum.equals(drugiDatum)==true){
			//System.out.println("Oni su jednaki");
	//	} else { 
		//	System.out.println("Nisu jednaki");
		//}
		
		System.out.println(prviDatum.compare(drugiDatum));
		
		}
		
	}


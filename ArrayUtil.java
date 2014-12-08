public class ArrayUtil {

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

	/**
	 * funkcija prima duzinu niza a vraca noviNiz
	 * 
	 * @param size- to je velicina niza
	 * @return - niz
	 */

	public static int[] getUserArray(int size) {

		int[] noviNiz = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("\nUnesite clanove niza");
			noviNiz[i] = TextIO.getInt();
		}

		return noviNiz;
	}

	/**
	 * 
	 * @param size
	 * @param default7
	 * @return
	 */

	public static int[] getArray(int size, int default7) {

		int[] noviNiz2 = new int[size];

		for (int i = 0; i < size; i++) {
			noviNiz2[i] = default7;
		}

		return noviNiz2;
	}

	/**
	 * funkcija prenosi vrijednosti niza iz niz 1 u niz2
	 * 
	 * @param Niz1
	 * @param Niz2
	 */
	public static int[] copyArray(int[] Niz1, int[] Niz2) {
		if (Niz1.length > Niz2.length){
			Niz2 = new int [Niz1.length];
		}
		for (int i = 0; i < Niz1.length; i++) {
			
		Niz2[i] = Niz1[i];
		}
		
		return Niz2;

	}
	
		
		
//	}

	public static void pomjeriULijevo(int[] noviArray) {
		
		for (int i = 0; i<noviArray.length; i++){
			if (i + 1 != noviArray.length) { // if uslov: ako je brojac + 1 razlicit od duzine niza
				noviArray[i] = noviArray[i + 1]; // niz se uvecava za jedno polje
			} else
				noviArray[i] = 0; // osigurava upis "nule" ili nekog drugog broja na kraj niza
		}
		}
		
	}




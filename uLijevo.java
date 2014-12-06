/**
 * 
 * @author Edib Imamovic
 *
 */

public class pomjeriUlijevo {

	public static void main(String[] args) {

		System.out.println("Unesite duzinu niza");
		int duzinaNiza = TextIO.getInt();

		int[] niz = new int[duzinaNiza];

		unosNiza(niz);
		ispisNiza(niz);
		pomjeriNizULijevo(niz);
	}

	/**
	 * @param niz
	 *            , funkcija za ispis niza u lijevu stranu
	 */
	public static void pomjeriNizULijevo(int[] niz) {
		System.out.println("\nniz pomjeren u lijevo je:");
		for (int i = 0; i < niz.length; i++) { // petlja
			if (i + 1 != niz.length) { // if uslov: ako je brojac + 1 razlicit od duzine niza
				niz[i] = niz[i + 1]; // niz se uvecava za jedno polje
			} else
				niz[i] = 0; // osigurava upis "nule" ili nekog drugog broja na kraj niza
			System.out.print(niz[i]);
		}

	}

	/**
	 * 
	 * @param niz
	 *            , funkcija za ispis niza
	 */
	public static void ispisNiza(int[] niz) {
		System.out.printf("Uneseni niz je:");
		for (int i = 0; i < niz.length; i++) {
			System.out.printf("%d", niz[i]);
		}

	}

	/**
	 * @param niz
	 *            , funkcija za unos niza
	 */
	public static void unosNiza(int[] niz) {

		System.out.println("Unesite clanove niza");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = TextIO.getInt();
		}

	}

}

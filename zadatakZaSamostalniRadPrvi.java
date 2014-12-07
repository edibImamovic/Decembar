/**
 * int[][] kreirajMatricu(int brojRedova, int brojKolona) - funkcija pravi
 * matricu zadane velicine I trazi od korisnika da popuni matricu int[]
 * sabiranje(int[][] matrica1, int[][]matrica 2) u slucaju da matrice nije
 * moguce pomnoziti koristiti naredbu throw IllegalArgumentException sa porukom
 * "Matrice nije sabrat pomnoziti". int[] oduzimanje(int[][] matrica1, int[][]
 * matrica2) u slucaju da matrice nije moguce pomnoziti koristiti naredbu throw
 * IllegalArgumentException sa porukom "Matrice nije moguce oduzeti". int[]
 * mnozenje(int[][] matrica1, int[][] matrica2) - u slucaju da matrice nije
 * moguce pomnoziti koristiti naredbu throw IllegalArgumentException sa porukom
 * "Matrice nije moguce pomnoziti".
 * 
 */

public class zadatakZaSamostalniRad1 {
	public static void main(String[] args) {

		System.out.println("Unesite broj redova"); // Unos broja redova
		int brojRedova = TextIO.getInt();

		System.out.println("Unesite broj kolona"); // Unos broja kolona
		int brojKolona = TextIO.getInt();

		int[][] FunkcijaKreirajMatricu = kreirajMatricu(brojRedova, brojKolona); // funkcija u kojoj se unose clanovi matrice
		ispisiMatricu(FunkcijaKreirajMatricu); // funkcija za ispis popunjene matrice

	}

	private static void ispisiMatricu(int[][] funkcijaKreirajMatricu) {

		System.out.println("Uneseni clanovi matrice: ");
		for (int i = 0; i < funkcijaKreirajMatricu.length; i++) {
			for (int j = 0; j < funkcijaKreirajMatricu[i].length; j++) {
				System.out.printf("%d  ", funkcijaKreirajMatricu[i][j]);
			}
			System.out.println(" ");
		}

		System.out.println(" ");

	}

	private static int[][] kreirajMatricu(int brojRedova, int brojKolona) {

		int[][] kreiranjeMatrice = new int[brojRedova][brojKolona];

		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				System.out.println("Unesite clanove matrice ");
				kreiranjeMatrice[i][j] = TextIO.getInt();
			}
		}

		return kreiranjeMatrice;
	}

}

**
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

		int[][] matrica1 = kreirajMatricu1(brojRedova, brojKolona); 
		ispisiMatricu1(matrica1); 
		
		System.out.println("Unesite broj redova"); // Unos broja redova
		int brojRedova2 = TextIO.getInt();

		System.out.println("Unesite broj kolona"); // Unos broja kolona
		int brojKolona2 = TextIO.getInt();

		int[][] matrica2 = kreirajMatricu2(brojRedova2, brojKolona2); 
		ispisiMatricu1(matrica2); 

		int[][] sumaSabiranje = sabiranje(matrica1, matrica2);
		ispisiMatricu1(sumaSabiranje);
		
		int[][] sumaOduzimanje = oduzimanje(matrica1, matrica2);
		ispisiMatricu1(sumaOduzimanje);

	}

	private static int[][] sabiranje(int[][] matrica1, int[][] matrica2) {

		int[][] sumaSabiranje = new int[matrica1.length][matrica1[0].length];

		try {
			for (int i = 0; i < matrica1.length; i++) {
				for (int j = 0; j < matrica1[i].length; j++) {
				
					
					
					sumaSabiranje[i][j] = matrica1[i][j] + matrica2[i][j];
				}
			}
				}
	
		catch (IllegalArgumentException e) {
			System.out.println("Matrice nije moguće sabrati");
		}

		return sumaSabiranje;

	}

	private static int[][] oduzimanje(int[][] matrica1, int[][] matrica2) {

		int[][] sumaOduzimanje = new int[matrica1.length][matrica1[0].length];

		try {
			for (int i = 0; i < matrica1.length; i++) {
				for (int j = 0; j < matrica1[i].length; j++) {
					sumaOduzimanje[i][j] = matrica1[i][j] - matrica2[i][j];
				}
			}
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Matrice nije moguće oduzeti");
		}

		return sumaOduzimanje;

	}
	private static void ispisiMatricu1(int[][] funkcijaKreirajMatricu) {

		System.out
				.println("Clanovi niza /sabiranje/oduzimanje/mnozenje i unos: ");
		for (int i = 0; i < funkcijaKreirajMatricu.length; i++) {
			for (int j = 0; j < funkcijaKreirajMatricu[i].length; j++) {
				System.out.printf("%d  ", funkcijaKreirajMatricu[i][j]);
			}
			System.out.println(" ");
		}

		System.out.println(" ");

	}

	private static int[][] kreirajMatricu1(int brojRedova, int brojKolona) {

		int[][] kreiranjeMatrice = new int[brojRedova][brojKolona];

		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				System.out.println("Unesite clan prve matrice: ");
				kreiranjeMatrice[i][j] = TextIO.getInt();
			}
		}

		return kreiranjeMatrice;
	}

	private static void ispisiMatricu2(int[][] funkcijaKreirajMatricu) {

		System.out.println("Uneseni clanovi druge matrice su : ");
		for (int i = 0; i < funkcijaKreirajMatricu.length; i++) {
			for (int j = 0; j < funkcijaKreirajMatricu[i].length; j++) {
				System.out.printf("%d  ", funkcijaKreirajMatricu[i][j]);
			}
			System.out.println(" ");
		}

		System.out.println(" ");

	}

	private static int[][] kreirajMatricu2(int brojRedova2, int brojKolona2) {

		int[][] kreiranjeMatrice = new int[brojRedova2][brojKolona2];

		for (int i = 0; i < brojRedova2; i++) {
			for (int j = 0; j < brojKolona2; j++) {
				System.out.println("Unesite clan druge matrice: ");
				kreiranjeMatrice[i][j] = TextIO.getInt();
			}
		}

		return kreiranjeMatrice;
	}

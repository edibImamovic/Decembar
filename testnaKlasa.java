
public class testnaKlasa {
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		ArrayUtil.printArray(array); // poziv funkcije 
		
		int [] noviArray = ArrayUtil.getUserArray(4);
		System.out.print("\nClanovi niza su:");
		ArrayUtil.printArray(noviArray);
		System.out.println();
		
		System.out.print("\nClanovi niza su:");
		int [] noviArray2 = ArrayUtil.getArray(4, -50);
		ArrayUtil.printArray(noviArray2);
		
		ArrayUtil.copyArray(noviArray, noviArray2);
		ArrayUtil.printArray(noviArray2);
		ArrayUtil.copyArray(noviArray, noviArray2);
		ArrayUtil.printArray(noviArray2);
		
		ArrayUtil.pomjeriULijevo(noviArray);
		System.out.println("Ïspis nakon pomjeranja");
		ArrayUtil.printArray(noviArray);
}
}

package code04_15;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		
		arrayB = new int[3];
		System.out.println(arrayB[0]);
	}

}

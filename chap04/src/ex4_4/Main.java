package ex4_4;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		boolean hit = false;
		
		for (int num : numbers) {
			if(num == input) {
				System.out.println("アタリ！");
				hit = true;
				break;
			}
		}
		if (!hit) {
			System.out.println("ハズレ！");
		}
		                                              
	}

}

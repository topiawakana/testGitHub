package code03_09;

public class Main2 {

	public static void main(String[] args) {
		while(true) {
			System.out.println("0～2の数値を入れてください");
			int rnd = new java.util.Random().nextInt(3);
			int input = new java.util.Scanner(System.in).nextInt();
			if(rnd == input) break;
			System.out.println("はずれ！");
		}
		System.out.println("正解！");
	}

}

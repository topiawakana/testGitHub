package quizans03_06;

public class Main {

	public static void main(String[] args) {
		// ①
		System.out.println("【数あてゲーム】");
		// ②
		int ans = new java.util.Random().nextInt(10);
		// ③
		for(int i = 0; i < 5; i++ ) {
			// ④
			System.out.println("0～9の数字を入力してください");
			// ⑤
			int num = new java.util.Scanner(System.in).nextInt();
			// ⑥
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			}else {
				// ⑦
				System.out.println("違います");
			}
		}
		// ⑧
		System.out.println("ゲームを終了します");
	}

}

package code04_12;

public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10];
		char[] base = {'A', 'T', 'G', 'C'};

		//塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		//生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
//			switch (seq[i]) {
//			case 0 -> {
//				System.out.print("A ");
//			}
//			case 1 -> {
//				System.out.print("T ");
//			}
//			case 2 -> {
//				System.out.print("G ");
//			}
//			case 3 -> {
//				System.out.print("C ");
//			}
//			}
		}
	}

}

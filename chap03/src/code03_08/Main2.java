package code03_08;

public class Main2 {

	public static void main(String[] args) {
		{
			// ループ変数を1からスタートする
			for(int i = 1; i <= 10; i++) {
				System.out.print("現在" + i + "周目→");
			}
		}
		// 改行処理
		System.out.println();
		{
			// ループ変数を2ずつ増やす
			for(int i = 0; i < 10; i += 2){
				System.out.print("現在" + (i + 1) + "周目→");
			}
		}
		// 改行処理
		System.out.println();
		{
			// ループ変数を10から1ずつ1まで減らしていく
			for(int i = 10; i > 0; i--) {
				System.out.print("現在" + i + "周目→");
			}
		}
		// 改行処理
		System.out.println();
		{
			// ループ変数を初期化しない
			int i = 0;
			for(; i < 10; i++) {
				System.out.print("現在" + (i + 1) + "周目→");
			}
			System.out.println();
			System.out.println(i + "周目で終わりました");
		}
		System.out.println();
		{
			// 繰り返し時の処理を行わない
			for(int i = 0; i < 10;) {
				i++;
				System.out.print("現在" + i + "周目→");
			}
		}
	}

}

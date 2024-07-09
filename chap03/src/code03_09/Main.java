package code03_09;

public class Main {

	public static void main(String[] args) {
		// i=1～9までの繰り返し
		for(int i = 1; i < 10; i++) {
			// j=1～9までの繰り返し
			for( int j = 1; j < 10; j++) {
				if(i * j < 10) System.out.print(" ");
				System.out.print(i * j); 	// 掛け算の結果を出力
				System.out.print(" ");	// 空白を出力
				break;
			}
			System.out.println();			// 改行を出力
		}
	}

}

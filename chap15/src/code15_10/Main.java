package code15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…"
				+ (end - start) + "ミリ秒でした");
		System.out.println(start);
	}

}

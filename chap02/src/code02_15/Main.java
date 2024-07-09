package code02_15;

public class Main {

	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		//サイコロ（1～6）
//		r = new java.util.Random().nextInt(6) + 1;
		r = new java.util.Random().nextInt(1, 7);
		System.out.println(r);
	}

}

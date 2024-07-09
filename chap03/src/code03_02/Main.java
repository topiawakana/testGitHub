package code03_02;

public class Main {
	public static void main(String[] args) {
		int age = 18;
		boolean isMale = false;
		if(!(age >= 18)) {
		//(!     true  )
		//(   false  )
			
		}
		if(age >= 18 && isMale == false) {
		//(   true   &&       true     ){
		//(         true         ){
			System.out.println("18歳以上かつ男性ではない");
		}
		String str = new String("スッキリ");
		str = null;
		if(str != null && str.equals("スッキリ")) {
			System.out.println("equals 同じ値です");
		}
//		String str = "すっきり";
//		if(str == "すっきり") {
//			System.out.println("== 同じ値です");
//		}
//		if(str.equals("すっきり") || str.equals("スッキリ")) {
//		//(        false          ||          true     ){
//		//(                      true         ){
//			System.out.println("equals 同じ値です");
//		}
		boolean doorClose = true;	// ここでtrueかfalseを代入
		while(doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
			// ランダムでtrueかfalseを代入
			doorClose = new java.util.Random().nextBoolean();
		}
		System.out.println("トイレに入る");
	}
}

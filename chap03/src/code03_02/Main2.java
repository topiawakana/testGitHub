package code03_02;

public class Main2 {

	public static void main(String[] args) {
		boolean doorClose = false;	// ここでtrueかfalseを代入
		do{
			System.out.println("ノックする");
			System.out.println("1分待つ");
			// ランダムでtrueかfalseを代入
			doorClose = new java.util.Random().nextBoolean();
		}while(doorClose == true);
		System.out.println("トイレに入る");
	}

}

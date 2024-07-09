package code03_04;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
//		if(fortune == 1) {
//			System.out.println("大吉");
//		}else if (fortune == 2) {
//			System.out.println("中吉");
//		}else if(fortune == 3) {
//			System.out.println("吉");
//		}else {
//			System.out.println("凶");
//		}
//		switch(fortune) {
//			default ->{
//				System.out.println("凶");
//			}
//			case 1 -> {
//				System.out.println("大吉");
//			}
//			case 2 ->{
//				System.out.println("中吉");
//			}
//			case 3 ->{
//				System.out.println("吉");
//			}
//		}
		String s = 
				switch(fortune) {
				default ->"凶";
				case 1 -> "大吉";
				case 2 -> "中吉";
				case 3 -> "吉";
				};
		System.out.println(s);
	}

}

package quizans03_03;

public class Main {

	public static void main(String[] args) {
		// ①
		int isHungry = new java.util.Random().nextInt(2);
		String food = "カレーライス";
		// ②
		System.out.println("こんにちは");
		// ③
		if(isHungry == 0) {
			System.out.println("お腹いっぱいです");
		}else {
			System.out.println("はらぺこです");
		}
		// ④
		if(isHungry != 0) {
			System.out.println(food + "をいただきます");
		}
		// ⑤
		System.out.println("ごちそうさまでした");
			
	}

}

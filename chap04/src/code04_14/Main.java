package code04_14;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int value : scores) {
			System.out.println(value);
		}
		
		//点数の合計を拡張for文で計算
		int sum = 0;
		for (int value : scores) {
			sum += value;
		}
		System.out.println("合計点:" + sum);
	}

}

package code04_19;

public class Main {

	public static void main(String[] args) {
		int[][] scores = {{40,50,60},{80,60,70,90}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		
		//for文で中身を表示
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j]);
			}
		}
		
		for(int[] sc : scores) {
			for(int val : sc) {
				System.out.println(val);
			}
		}
	}

}

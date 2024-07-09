package code16_00;

public class Main {

	public static void main(String[] args) {
		//配列を準備
		String[] names = new String[3];
		
		//3人を追加
		names[0] = "たなか";
		names[1] = "すずき";
		names[2] = "さいとう";
		
		System.out.println(names[1]);
		
		//通常のfor文
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//拡張for文
		for(String s : names) {
			System.out.println(s);
		}
	}

}

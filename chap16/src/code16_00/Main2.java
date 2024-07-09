package code16_00;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		//ArrayListを準備
		ArrayList<String> names = 
				new ArrayList<String>();
		
		//3人を追加
		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");
		
		System.out.println(names.get(1));
		
		//通常のfor文
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//拡張for文
		for(String s : names) {
			System.out.println(s);
		}
	}

}

package code17_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static boolean test() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
			return true;
		}catch(IOException e) {
			System.out.println("何らかの例外が発生しました");
			e.printStackTrace();
		}finally {
			System.out.println("実行");
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(test());
	}
}

package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
			fw.close();
			fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		}catch(IOException e ) {
			System.out.println("エラーが発生しました");
			System.out.println("エラー:" + e.getMessage());
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("エラー:" + e.getMessage());
			e.printStackTrace();
			System.out.println("nullだよ");
		}
		
	}
}

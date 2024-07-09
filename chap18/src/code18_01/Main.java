package code18_01;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
//		int input = fr.read();
//		while (input != -1) {
//			System.out.print((char)input);
//			input = fr.read();
//		}
//		fr.close();
	}

}

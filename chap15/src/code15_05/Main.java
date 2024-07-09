package code15_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name = null;
		do {
			System.out.println("名前を入力してください");
			name = new Scanner(System.in).nextLine();
		}while(!isValidPlayerName(name));
		System.out.println("ゲームを開始します");
	}
	
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
//	public static boolean isValidPlayerName(String name) {
//		if(name.length() != 8) {
//			return false;
//		}
//		char first = name.charAt(0);
//		if(!(first >= 'A' && first <= 'Z')) {
//			return false;
//		}
//		for(int i = 1; i < 8; i++) {
//			char c = name.charAt(i);
//			if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
//				return false;
//			}
//		}
//		return true;
//	}
}

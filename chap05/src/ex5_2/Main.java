package ex5_2;

public class Main {

	public static void main(String[] args) {
		email("次回のテストについて",
				"everyone@topiamail.com",
				"次回のテストは6月5日に実施します。");
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}

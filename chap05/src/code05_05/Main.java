package code05_05;

public class Main {
	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
		int x = 300;
		int y = 80;
		add(x, y);
	}
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}

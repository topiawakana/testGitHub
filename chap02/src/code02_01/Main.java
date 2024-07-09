package code02_01;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		a = 20;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);
		
		int d = 0x11;
		int e = 0b0011;
		System.out.println(d);
		System.out.println(e);
		
		long price = 2_000_000L;
		System.out.println(price + "円");
	}

}

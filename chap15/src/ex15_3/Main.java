package ex15_3;

public class Main {

	public static void main(String[] args) {
		//(1)
		String s1 = "Hello World";
		System.out.println(s1 + ":" + s1.matches(".*"));
		//(2)
		String[] s2 = {"A03","A2","A111","AA2","B03","B2"};
		for(String s : s2) {
//			System.out.println(s + ":" + s.matches("A[0-9]{1,2}"));
			System.out.println(s + ":" + s.matches("A\\d{1,2}"));
		}
		//(3)
		String[] s3 = {"US","USE","USER","User","user","UPPER"};
		for(String s : s3) {
			System.out.println(s + ":" + s.matches("U[A-Z]{3}"));
		}
	}

}

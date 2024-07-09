package ex17_2;

public class Main {

	public static void main(String[] args) {
		//①
		String s = null;
		//②
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース（ここまで）ーー");
		}
	}

}

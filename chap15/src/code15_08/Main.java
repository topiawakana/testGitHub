package code15_08;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
		
		String s2 = "2024年6月19日";
		//"2024/6/19"に置換
		String w2 = s2.replaceAll("[年月]", "/");
		w2 = w2.replace("日", "");
		System.out.println(w2);
	}

}

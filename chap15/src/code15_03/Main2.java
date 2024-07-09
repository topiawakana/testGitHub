package code15_03;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String s2 = "    Hello   World     ";
		System.out.println("|" + s2.trim() + "|");
		
		String s3 = "This is a pen.";
		System.out.println(s3.replace("pen", "note"));
		
		String s4 = "2024/06/18";
		System.out.println(s4.replace("/", ""));
		
		String s5 = "松,竹,梅";
		String[] arr = s5.split(",");
		System.out.println(Arrays.toString(arr));
	}

}

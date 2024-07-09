package code15_08;

public class Main2 {

	public static void main(String[] args)throws Exception {
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		for(char c : data1) {
			System.out.print(c);
			Thread.sleep(1000);
		}
		System.out.println();
//		byte[] data2 = str.getBytes("utf-8");
		byte[] data2 = str.getBytes();
		for(byte b : data2) {
			System.out.print(b + "/");
		}
		
	}

}

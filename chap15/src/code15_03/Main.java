package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" 
				+ s1.substring(3));
		System.out.println("文字列s1の4～8文字目は" 
				+ s1.substring(3, 8));
		
		//住所の中から区の名前を取り出す
		String[] address = {"東京都新宿区西新宿",
				"東京都港区赤坂", "東京都江戸川区西葛西"};
		for (String ad : address) {
			//"都"の次の文字の位置を検索
			int start = ad.indexOf("都") + 1;
			//"区"の次の文字の位置を検索
			int end = ad.indexOf("区") + 1;
			//startからendの手前までを切り出す
			System.out.println(ad.substring(start, end));
		}
	}

}

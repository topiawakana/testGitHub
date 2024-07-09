package code18_03;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws Exception {
		URI uri = new URI("https://book.impress.co.jp");
		URL u = uri.toURL();
		InputStream is = u.openStream();
		int i = is.read();
		while(i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}
	}

}

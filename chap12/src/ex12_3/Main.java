package ex12_3;

public class Main {

	public static void main(String[] args) {
//		Y[] ys = new Y[2];
//		ys[0] = new A();
//		ys[1] = new B();
		Y[] ys = {new A(), new B()};
		//拡張for文
		for (Y y : ys) {
			y.b();
		}
		//通常のfor文
		for (int i = 0; i < ys.length; i++) {
			ys[i].b();
		}
		//while文
		int i = 0;
		while (i < ys.length) {
			ys[i].b();
			i++;
		}
		
	}

}

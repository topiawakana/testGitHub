package quizans16_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		for(Hero h:list) {
			System.out.println(h.getName());
		}
		// イテレーター
		Iterator<Hero> it = list.iterator();
		while(it.hasNext()) {
			Hero h = it.next();
			System.out.println(h.getName());
		}
		// 通常のfor文
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}

}

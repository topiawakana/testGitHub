package quizans16_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import quizans16_02.Hero;

public class Main {
	public static void test() {
		var b = 1;
		var c = "";
		System.out.println("3+5は"+3+5+"です");
		return;
	}

	public static void main(String[] args) {
		System.out.println("3+5は"+3+5+"です");
		Map<Hero,Integer> map = new HashMap<>();
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		map.put(h1, 3);
		map.put(h2, 7);
		for(Hero h:map.keySet()) {
			int num = map.get(h);
			System.out.println( h.getName() + "が倒した敵=" + num);
		}
		// イテレーター
		Iterator<Hero> it = map.keySet().iterator();
		while(it.hasNext()) {
			Hero h = it.next();
			int num = map.get(h);
			System.out.println( h.getName() + "が倒した敵=" + num);
		}
	}

}

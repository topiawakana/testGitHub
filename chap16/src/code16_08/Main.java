package code16_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Hero{
	public String name;
	public int hp;
	@Override
	public int hashCode() {
		return Objects.hash(name,hp);
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {return true;}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(h.name.equals(this.name)) {
				if(h.hp==this.hp) {
					return true;
				}
			}
		}
		return false;
	}
}
public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		List<Hero> list = new ArrayList<>();
		list.add(h);
		h.name = "スガワラ";
//		System.out.println(list.get(0).name);
		Set<Hero> set = new HashSet<>();
		set.add(h);
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 50;
		Hero h2 = new Hero();
		h2.name = "スガワラ";
		h2.hp = 100;
		Hero h3 = new Hero();
		h3.name = "ミナト";
		h3.hp = 100;
		set.add(h1);
		set.add(h2);
		set.add(h3);
		for(Hero he:set) {
			System.out.println(he.name);
		}
	}

}

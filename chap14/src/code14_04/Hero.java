package code14_04;

public class Hero {
	String name;
	int hp;
//	@Override
//	public String toString() {
//		return "Hero [name=" + name + ", hp=" + hp + "]";
//	}
	
	public String toString() {
		return "名前:" + this.name + "／HP:" + this.hp;
	}
	
	public boolean equals(Object o) {
		if (this == o) {return true;}
		if (o instanceof Hero h) {
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}

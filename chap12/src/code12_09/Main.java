package code12_09;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		
		Slime s = new Slime();
		h.attack(s);
		
		Goblin g = new Goblin();
		h.attack(g);
	}

}

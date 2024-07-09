package code12_02;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		
		Character c = w;
		c.attack(m);
//		c.fireball(m);
		
		if (c instanceof Wizard w2) {
			w2.fireball(m);
		}
		
		if (c instanceof Wizard) {
			Wizard w2 = (Wizard)c;
			w2.fireball(m);
		}
	
	}

}

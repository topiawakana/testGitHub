package code10_01;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();
		
		Matango m = new Matango();
		
		sh.fly();
		sh.attack(m);
	}

}

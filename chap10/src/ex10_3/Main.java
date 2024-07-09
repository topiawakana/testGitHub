package ex10_3;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		
		while(h.hp > 0 && pm.hp > 0) {
			h.attack(pm);
			pm.attack(h);
		}
		System.out.println(h.name + "のHP:" + h.hp);
		System.out.println("毒マタンゴ" + pm.suffix + "のHP:" + pm.hp);
	}

}

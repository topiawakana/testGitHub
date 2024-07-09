package ex13_4;

public class Main {
	
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(100);
		Wizard w = new Wizard();
		Wand wn = new Wand();
		wn.setName("アイスワンド");
		wn.setPower(5.5);
		w.setWand(wn);
		w.heal(h);
	}
}

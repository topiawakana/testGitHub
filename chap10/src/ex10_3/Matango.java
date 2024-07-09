package ex10_3;

public class Matango {
	int hp = 50;
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
class Hero{
	String name = "ミナト";
	int hp = 100;
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ダメージを与えた！");
	}
}

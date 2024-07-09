package ex8_3;

public class Cleric {
	String name;
	
	final int MAX_HP = 50;
	int hp = this.MAX_HP;
	
	final int MAX_MP = 10;
	int mp = this.MAX_HP;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "はセルフエイドの魔法をとなえた！");
		System.out.println(this.name + "の体力は全快した！");
	}
	
}

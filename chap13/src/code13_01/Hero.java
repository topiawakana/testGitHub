package code13_01;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した!");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("おばけキノコ" + m.suffix 
				+ "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp < 0) {
			this.die();
		}
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public Sword getSword() {
		return this.sword;
	}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
					("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
					("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException
					("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
}

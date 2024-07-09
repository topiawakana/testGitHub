package code12_09;

public class Hero extends Character{
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}
}
class Thief extends Character{
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5ポイントのダメージ");
		m.hp -= 5;
	}
}

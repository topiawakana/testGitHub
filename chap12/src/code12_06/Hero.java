package code12_06;

public class Hero extends Character{
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}
}
class Thief extends Character{
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5ポイントのダメージ");
		m.hp -= 5;
	}
}

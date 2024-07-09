package code14_08;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero.money = 500;
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		System.out.println(h1.hp);
		h1.money = 1000;
		System.out.println(Hero.money);
	}

}

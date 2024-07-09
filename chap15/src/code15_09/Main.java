package code15_09;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("minato", "hero", 280);
		Hero h2 = new Hero("asaka", "witch", 32000);
		Hero h3 = new Hero("sugawara", "sage", 41000);
		Hero[] heroes = {h1, h2, h3};
		for (Hero h : heroes) {
			printStatus(h);
		}
	}
	public static void printStatus(Hero hero) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format
				(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
//		System.out.printf(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
//		System.out.println();
	}
}

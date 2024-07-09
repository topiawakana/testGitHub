package ex8_4;

public class Main {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "スガワラ";
		c.hp = 30;
		
		c.selfAid();
		c.pray(3);
	}

}

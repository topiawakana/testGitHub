package code13_01;

public class Sword {
	private String name;
	private int damage;
	
	public Sword(String name, int damage) {
		super();
//		this.name = name;
//		this.damage = damage;
		this.setName(name);
		this.setDamage(damage);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}

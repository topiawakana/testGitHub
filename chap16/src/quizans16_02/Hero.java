package quizans16_02;

public class Hero {
	private String name;
	public Hero(String name) {this.name = name;}
	public String getName() { return this.name; }
	// getName()を使用しないで名前表記
	@Override
	public String toString() {
		return this.name;
	}
}

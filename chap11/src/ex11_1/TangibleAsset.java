package ex11_1;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
}

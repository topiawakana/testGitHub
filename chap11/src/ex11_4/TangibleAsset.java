package ex11_4;

public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	public TangibleAsset(String name, int price, String color, double weight) {
		super(name, price);
		this.color = color;
		this.weight = weight;
	}

	//getter
	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

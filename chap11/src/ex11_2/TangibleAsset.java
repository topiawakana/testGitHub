package ex11_2;

public abstract class TangibleAsset extends Asset{
	String color;
	//コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	//getter
	public String getColor() {
		return color;
	}
	
}

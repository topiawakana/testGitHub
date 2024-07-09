package ex11_4;

public class Computer extends TangibleAsset{
	String makerName;
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	//getter
	public String getMakerName() {
		return makerName;
	}
	
	
}

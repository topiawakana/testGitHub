package ex11_4;

public class Book extends TangibleAsset{
	String isbn;
	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	//getter
	public String getIsbn() {
		return isbn;
	}
	
}

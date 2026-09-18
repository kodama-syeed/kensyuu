package ch11;

public class Main11_6_Book extends Main11_6_TangibleAsset {
	String name;
	int price;
	String color;
	String isbn;

	//コンストラクタ
	public Main11_6_Book(String name, int price, String color, String isbn) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.isbn = isbn;
	}

	//メソッド

	public String getIsbn() {
		return this.isbn;
	}

}
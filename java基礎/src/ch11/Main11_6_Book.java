package ch11;

public class Main11_6_Book extends Main11_6_TangibleAsset {

	String isbn;

	//コンストラクタ
	public Main11_6_Book(String name, int price, String color, String isbn,double weight) {
		super(name,price,color,weight);
		this.isbn = isbn;
	}

	//メソッド

	public String getIsbn() {
		return this.isbn;
	}

}
//練習問題11-6
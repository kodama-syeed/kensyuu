package ch11;

public class Main11_6_Computer extends Main11_6_TangibleAsset {

	String makerName;

	//コンストラクタ
	public Main11_6_Computer(String name, int price, String color, String makerName,double weight) {
		super(name,price,color,weight);
		this.makerName = makerName;
		
	}

	//メソッド

	public String getMakerName() {
		return this.makerName;
	}
}
//練習問題11-6

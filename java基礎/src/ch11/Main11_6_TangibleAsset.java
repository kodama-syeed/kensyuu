package ch11;

public abstract class Main11_6_TangibleAsset extends Main11_6_Asset implements Main11_6_Thing {

	String color;
	double weight;

	public Main11_6_TangibleAsset(String name, int price, String color, double weight) {
		super(name, price);

		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return this.color;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
//練習問題11-6

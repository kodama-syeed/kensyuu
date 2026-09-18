package ch11;

public class Main11_6_Computer extends Main11_6_TangibleAsset{
	
		String name;
		int price;
		String color;
		String makerName;

		//コンストラクタ
		public Main11_6_Computer(String name, int price, String color, String makerName) {
			this.name = name;
			this.price = price;
			this.color = color;
			this.makerName = makerName;

		}

		//メソッド
	
		
		public String getMakerName() {
			return this.makerName;
		}
	}

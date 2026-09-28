package ch13;

public class Main13_7_Wand {
	private String name;
	private double power;

	public String GetName() {
		return this.name;
	}

	public void setName(String name) {
		if(name==null||name.length()<=2) {
			throw new IllegalArgumentException
			("名前が短すぎる。処理を中断。");
		}
		
		this.name = name;
	}

	public double GetPower() {
		return this.power;
	}

	public void setPower(double power) {
		
	if(power>0.5||power<100) {
		throw new IllegalArgumentException
		("増幅率がおかしい。処理を中断。");
	}
		this.power = power;
	}

}

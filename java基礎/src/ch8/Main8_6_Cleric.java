package ch8;

public class Main8_6_Cleric {

	String name;
	int hp = 50;
	int maxhp = 50;
	int mp = 10;
	int maxmp = 10;
	int prayTime = new java.util.Scanner(System.in).nextInt();

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.maxhp;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int prayTime) {
		System.out.println(this.name + "は" + prayTime + "秒間、天に祈った！");
		int healvalue = new java.util.Random().nextInt(prayTime + 3);

		if (healvalue >= this.maxmp) {
			healvalue = this.maxmp;
		}
		this.mp += healvalue;
		System.out.println("MPが" + healvalue + "回復した！");
		return healvalue;
	}
}
//練習問題8-6

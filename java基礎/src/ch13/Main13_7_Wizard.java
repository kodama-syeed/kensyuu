package ch13;
import  ch8.Main8_2_Hero;

public class Main13_7_Wizard {
	private int hp;
	private int mp;
	private String name;
	private Main13_7_Wand wand;

	public void heal(Main8_2_Hero h) {
		int basePoint = 10;
		int recovPoint = 10;
		int recoverPoint = (int) (basePoint * this.wand.GetPower());
		h.setHp(h.GetHp() + recovPoint);
		System.out.println(h.GetName() + "のHPを" + recovPoint + "回復した！");
	}
	public int GetHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int GetMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	public String GetName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Main13_7_Wand GetWand() {
		return this.wand;
	}

	public void setWand(Main13_7_Wand wand) {
		this.wand = wand;
	}
}

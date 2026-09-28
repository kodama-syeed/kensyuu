package ch13;

import ch8.Main8_2_Hero;

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
		if (hp <= 0) {
			this.hp = 0;
		}

		this.hp = hp;
	}

	public int GetMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if (mp <= 0) {
			throw new IllegalArgumentException("MPが0である。処理を中断。");
		}
		this.mp = mp;
	}

	public String GetName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() <= 2) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}

		this.name = name;
	}

	public Main13_7_Wand GetWand() {
		return this.wand;
	}

	public void setWand(Main13_7_Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖を装備していない。処理を中断。");
		}
		this.wand = wand;
	}
}

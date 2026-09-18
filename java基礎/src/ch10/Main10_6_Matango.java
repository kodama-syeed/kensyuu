package ch10;

import ch8.Main8_2_Hero;

public class Main10_6_Matango {
	int hp = 50;
	char suffix;

	public Main10_6_Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Main8_2_Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
//練習問題10-6
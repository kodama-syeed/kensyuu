package ch10;

import ch8.Main8_2_Hero;

public class Main10_6_Poisonmatango extends Main10_6_Matango {

	int Poisonattackcount = 5;
	int Poisondamage;

	public Main10_6_Poisonmatango(char suffix) {
		super(suffix);
	}

	public void attack(Main8_2_Hero h) {
		super.attack(h);
		if (this.Poisonattackcount > 0) {
			System.out.println("更に毒の胞子をばらまいた!");
			Poisondamage = h.hp - h.hp / 5;
			System.out.println(Poisondamage + "ポイントのダメージ");
			this.Poisonattackcount -= 1;
		}
	}
}
//練習問題10-6
package ch8;

public class Main8_1_Main {
	public static void main(String[] args) {
		//勇者を生成
		Main8_2_Hero h = new Main8_2_Hero();
		//フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;

		Main8_3_Matango m1 = new Main8_3_Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Main8_3_Matango m2 = new Main8_3_Matango();
		m1.hp = 48;
		m1.suffix = 'B';

		System.out.println("勇者" + h.name + "を生み出しました！");
		//勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けキノコよ。逃げろ！
	}
}

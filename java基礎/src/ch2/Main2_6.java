package ch2;

public class Main2_6 {
	public static void main(String[] arges) {
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		//命令実行文を表示するコード

		int a = 5;
		int b = 20;
		int m = Math.max(a, b);
		System.out.println("比較実験:" + a + "と" + b + "とで大きいほうは・・・" + m);
		//どちらの数が大きいか比較するコード

		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね");
		//string型をint型に変換するコード

		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん・・・" + r + "歳ですね？");
		//ランダムな数値を表示させるコード

		System.out.println("あなたの名前を入力してください");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age2 + "歳の" + name2 + "さん");
		//キーボードから文字列と整数を受け取り、表示するコード
	}

}

package ch2;

public class Main2_5 {
	public static void main(String[] arges) {
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		//float型→double型に変換した際の比較コード

		int age = (int) 3.2f;
		System.out.println(age);
		//int型に小数を強制的に代入するコード

		double d2 = 8.5 / 2;
		long l = 5 + 2L;
		System.out.println(d2);
		System.out.println(l);
		//int型→double型orlong型に変換し計算するコード

		String msg = "私の年齢は" + 23;
		System.out.println(msg);
		//int型をstring型に変換し連結するコード
	}
}

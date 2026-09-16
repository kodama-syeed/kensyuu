package ch1;

public class Main1_3 {
	public static void main(String[] arges) {
		int age;
		age = 45;
		System.out.println(age);
		age = 30;
		System.out.println(age);
		//年齢を表示するコード

		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		//パイの面積を表示するコード

		System.out.println("パイの半径を倍にします");
		pie = pie * 2;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		//再びパイの面積を表示するコード

		float weight;
		weight = 65.3f;
		System.out.println("体重は" + weight);
		//体重をfloat型で表示するコード

		double height;
		height = 182.0;
		System.out.println("身長は" + height);
		//身長をdouble型で表示するコード
	}

}

package ch5;

public class Main5_8_4 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;

		double Traianglearea = calcTraiangleArea(bottom, height);
		double CircleArea = calcCircleArea(radius);

		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + Traianglearea + "平方cm");
		System.out.println("円の半径が" + radius + "cmの場合" + "面積は" + CircleArea + "平方cm");

	}

	public static double calcTraiangleArea(double bottom, double height) {
		double Traianglearea = bottom * height / 2;
		return Traianglearea;
	}

	public static double calcCircleArea(double radius) {
		double CircleArea = radius * radius * 3.14;
		return CircleArea;
	}
}

//練習問題5-4
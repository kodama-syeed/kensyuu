package ch4;

public class Main4_9 {
	public static void main(String[] args) {
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		//連取問題4-1

		int[] moneyList = { 121902, 8302, 55100 };
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int value : moneyList) {
			System.out.println(value);
		}
		//練習問題4-2

		//5行目:NullPointerExseption
		//6行目:ArrayIndexOutOfBoundsExption
		//練習問題4-3	

		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value2 : numbers) {
			if (value2 == input) {
				System.out.println("アタリ!!");
			}
		}
		//練習問題4-4
	}

}

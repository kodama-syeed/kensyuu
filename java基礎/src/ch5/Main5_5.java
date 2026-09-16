package ch5;

public class Main5_5 {
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		printArray(array);
	}
	//引数を用いた配列のコード
}

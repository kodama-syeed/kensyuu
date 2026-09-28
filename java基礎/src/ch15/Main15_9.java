package ch15;

public class Main15_9 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 101; i++) {
			sb.append(i+",");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
//練習問題15-1

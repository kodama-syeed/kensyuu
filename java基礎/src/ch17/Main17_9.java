package ch17;

public class Main17_9 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース（ここまで）ーー");
		}
	}

}
//練習問題17-1,2

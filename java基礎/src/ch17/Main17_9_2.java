
package ch17;

import java.io.IOException;

public class Main17_9_2 {
	public static void main(String[] args) throws IOException {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}
		
	}
}
//練習問題17-3

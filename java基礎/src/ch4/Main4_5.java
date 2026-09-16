package ch4;

public class Main4_5 {
	public static void main(String[] arges) {
		int[] arrayA= {1,2,3};
		int[] arrayB;
		arrayB=arrayA;
		arrayB[0]=100;
		System.out.println(arrayA[0]);
 	//配列の裏側を理解するコード(A=1 → A=B → B=100 ➡ A=100)
	}
}

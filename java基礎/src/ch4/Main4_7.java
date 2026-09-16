package ch4;

public class Main4_7 {
	public static void main(String[] arges) {

	int[][] scores=new int[2][3];
	scores[0][0]=40;
	scores[0][1]=50;
	scores[0][2]=60;
	scores[1][0]=80;
	scores[1][1]=60;
	scores[1][2]=70;
	System.out.println(scores[1][1]);
	//二次元配列のコード
		
	int [][] scores2= {{40,50,60},{80,60,70}};
	System.out.println(scores.length);
	System.out.println(scores[0].length);
	//親配列と子配列の要素数を表示するコード
	
	}
	
}

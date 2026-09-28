package ch15;

public class Main15_9_2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		String folder="c:¥javadev";
		String file="readme.txt";
		String s = "¥";

		
		if(!folder.endsWith(s)) {
			folder=folder+"¥";
		}
		
		sb.append(folder).append(file);
		
		String fs=sb.toString();
		System.out.println(fs);
	
		//練習問題15-2
	}
	
	String A;
	//A.matches("a-z");
	//練習問題15-3(1)
	//A.matches("A,0-9,0-9||null");
	//練習問題15-3(2)
	//A.matches("U,A-Z*");
	//練習問題15-3(3)
}

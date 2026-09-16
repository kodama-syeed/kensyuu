package ch3;

public class Main3_8 {
	public static void main(String[] arges) {
		//weight==60
		//練習問題3-1①
		//(age1+age2)*2>60	
		//練習問題3-1②	
		//age%2==1
		//練習問題3-1③
		//name=="湊"
		//練習問題3-1④

		//練習問題3-2 C,D,E,

		int isHungry = new java.util.Scanner(System.in).nextInt();
		String food = new java.util.Scanner(System.in).nextLine();
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
		
		//練習問題3-3
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("映画を見ます");
			System.out.println("寝ます");
		}
		//練習問題3-4
		
		System.out.println("[メニュー]1:検索　2:登録　3:削除　4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();

		switch (selected) {
		case 1 -> {
			System.out.println("検索します");
		}
		case 2 -> {
			System.out.println("登録します");
		}
		case 3 -> {
			System.out.println("削除します");
		}
		case 4 -> {
			System.out.println("変更します");
		}
		default -> {
		}
		}
		//練習問題3-5
	
	int ans=new java.util.Random().nextInt(9);
	for(int i=0; i<=5; i++)
	{
		System.out.println("0~9の数字を入力してください");
		int num= new java.util.Scanner(System.in).nextInt();
		if(num==ans) {
			System.out.println("アタリ！");
		}else {
			System.out.println("違います");
		}
	}
	System.out.println("ゲームを終了します");
	//練習問題3-6
	}
}
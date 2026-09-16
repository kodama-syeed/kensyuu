package ch3;

public class Main3_1 {
	public static void main(String[] arges) {
		boolean tenki =true;
		if(tenki==true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		}else {
			System.out.println("映画を見ます");
		}
		//変数の状態によって出力される文章が分岐するコード
		
		boolean doorClose=true;
		while(doorClose==true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		//変数の状態によって出力され続ける文章が分岐するコード
	}
	
}

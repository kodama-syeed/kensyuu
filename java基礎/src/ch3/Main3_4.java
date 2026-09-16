package ch3;

public class Main3_4 {
	public static void main(String[] arges) {
		System.out.println("あなたの運勢を占います");
		int fortune=new java.util.Random().nextInt(4)+1;
		if(fortune==1) {
			System.out.println("大吉");
		}else if(fortune==2) {
			System.out.println("中吉");
		}else if(fortune==3) {
			System.out.println("吉");
		}else if(fortune==4) {
			System.out.println("凶");
		}
		//if-elseを用いた冗長コード
	
	switch(fortune) {
	case 1->{
		System.out.println("大吉");
	}
	case 2->{
		System.out.println("中吉");
	}
	case 3->{
		System.out.println("吉");
	}
	default ->{
		System.out.println("凶");
	}
		}
//if-else文のコードをSwitch文に書き換えたコード
	
	switch(fortune) {
	case 1,2->{
		System.out.println("いいね");
	}
	
	case 3->{
		System.out.println("普通");
	}
	default ->{
		System.out.println("うーん");
	}
		}
	//caseラベルに複数の値を指定した場合のコード
	}
}
package ch5;

public class Main5_1 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		Hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}

	public static void Hello() {
		System.out.println("湊さん、こんにちは");
	}
	//簡易的なmainメソッドからの呼び出しコード

	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}

	public static void methodB() {
		System.out.println("methodB");
		methodA();
	}
	//mainメソッド以外からの呼び出し
}

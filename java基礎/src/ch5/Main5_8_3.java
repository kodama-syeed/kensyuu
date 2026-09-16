package ch5;

public class Main5_8_3 {
	public static void main(String[] args) {
		String address = "メールの宛先アドレス";
		String text = "メールの本文";
		mail(address, text);
	}

	public static void mail(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
}
//練習問題5-3
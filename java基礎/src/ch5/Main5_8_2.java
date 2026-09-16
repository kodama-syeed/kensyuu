package ch5;

public class Main5_8_2 {
	public static void main(String[] args) {

		String title = "メールのタイトル";
		String text = "メールの本文";
		String address = "メールの宛先アドレス";
		mail(address, title, text);
	}

	public static void mail(String address, String title, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

}

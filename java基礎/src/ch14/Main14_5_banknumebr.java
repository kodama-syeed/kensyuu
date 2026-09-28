package ch14;

public class Main14_5_banknumebr {
	String accountNumber;
	int balance;

	public String toString() {
		return "￥" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Main14_5_banknumebr a) {
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
		//練習問題14-1
	}

	public static final int maxhp = 50;

	public static final int maxmp = 10;

	//練習問題14-2
}

package ch4;

public class Main4_4 {
	public static void main(String[] arges) {
		int[] scores = { 20, 30, 40, 50, 80 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		//for文を使って配列を行うコード

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		//for文から集計を行うコード

		int count = 0;
		for (int i2 = 0; i2 < scores.length; i2++) {
			if (scores[i2] >= 50) {

				count++;
			}

		}
		System.out.println("50点以上の科目の数は:" + count);

		int[] seq = new int[10];

		for (int i3 = 0; i3 < seq.length; i3++) {
			seq[i3] = new java.util.Random().nextInt(4);

			switch (seq[i3]) {
			case 0 -> {
				System.out.println("A");
			}
			case 1 -> {
				System.out.println("T");
			}
			case 2 -> {
				System.out.println("G");
			}
			case 3 -> {
				System.out.println("C");
			}
			}

		}

	
	
}
	}


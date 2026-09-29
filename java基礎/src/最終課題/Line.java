package 最終課題;

public class Line implements Figure {
	private Point p1;
	private Point p2;

	/**
	 * 概要:引数なしコンストラクタの定義p1(x,y座標)、p2(x,y座標)全て0で初期化する。<br>
	 * 引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public Line() {

		this.p1 = new Point();
		this.p2 = new Point();

	}

	/**
	 * 概要:引数で受け取ったデータを用いて、2つのPointオブジェクトを生成。p1フィールドとp2フィールドにそれぞれを代入する。<br>
	 * 引数:4つのint型データ<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public Line(int x1, int y1, int x2, int y2) {

		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

	/**
	 *　概要:以下のようなメッセージを表示する。なお、始点をp1、終点をp2とする。<br>
       出力例："[線を描画] 始点(0,0)から終点(100,100)まで"<br>
	 * 引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public void draw() {
		System.out.println("[線を描画] 始点" + p1 + "から終点" + p2 + "まで");
	}

	/**
	 * 概要:始点データと終点データを使い、以下の計算式で算出した結果を返す。<br>
　　　　  (( 終点のx座標 - 始点のx座標 ) ^2　+ ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根<br>
	 * 引数:なし<br>
	 * 戻り値:double<br>
	 * 修飾子:public<br>
	 */
	public double getPerimeter() {
		double perimeterX = Math.pow(p2.getX() - p1.getX(), 2);
		double perimeterY = Math.pow(p2.getY() - p1.getY(), 2);
		double perimeter = Math.sqrt(perimeterX + perimeterY);
		return perimeter;
	}
}

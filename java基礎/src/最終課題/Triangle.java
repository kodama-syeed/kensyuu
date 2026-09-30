package 最終課題;

public class Triangle extends Polygon {

	private Point p1;
	private Point p2;
	private Point p3;

	/**
	 * 概要:引数で受け取ったデータを用いて、3つのPointオブジェクトを生成。<br>
	   p1フィールドとp2フィールド、p3フィールドにそれぞれを代入する。<br>
	   スーパークラス内で定義されているangleフィールドに3を代入する。<br>
	 * 引数:6つのint型データ<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * @param x1:三角形の点1を表すPoint型privateフィールド<br>
	 * @param y1:三角形の点1を表すPoint型privateフィールド<br>
	 * @param x2:三角形の点2を表すPoint型privateフィールド<br>
	 * @param y2:三角形の点2を表すPoint型privateフィールド<br>
	 * @param x3:三角形の点3を表すPoint型privateフィールド<br>
	 * @param y3:三角形の点3を表すPoint型privateフィールド<br>
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		angle = 3;
	}

	/**
	 * 概要:以下のようなメッセージを表示する。<br>
	   出力例："[三角形を描画] 点1(0,0)から点2(100,100)、点3(0, 200)の三角形"<br>
	 * 引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public void draw() {
		System.out.println("[三角形を描画] 点1" + p1 + "から点2" + p2 + "、点3" + p3 + "の三角形");
	}

	/**
	 *概要:3つの座標を使い、以下の計算式で算出した結果を返す。<br>
　　　　      p1からp2までの長さ + p2からp3までの長さ + p3からp1までの長さ<br>
	 *戻り値:double<br>
	 *引数:なし<br>
	 *修飾子:public<br>
	 */
	public double getPerimeter() {
		double perimater = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY()).getPerimeter() +
				new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY()).getPerimeter() +
				new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY()).getPerimeter();
		return perimater;
	}
}

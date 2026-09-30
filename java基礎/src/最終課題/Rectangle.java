package 最終課題;

public class Rectangle extends Polygon {
	protected Point p;
	protected int width;
	protected int height;

	/**
	 * 概要:第1引数と第2引数で受け取ったデータを用いて、1つのPointオブジェクトを生成し、pフィールドに代入する。
	   第3引数と第4引数をそれぞれwidthフィールド、heightフィールドに代入する。
	   スーパークラス内で定義されているangleフィールドに4を代入する。
	 * 引数:4つのint型データ
	 * 戻り値:なし
	 * 修飾子:public
	 * @param x:長方形の基準の位置を表すPoint型protectedフィールド
	 * @param y:長方形の基準の位置を表すPoint型protectedフィールド
	 * @param width:長方形の横幅を表すprotectedフィールド
	 * @param height:長方形の縦幅を表すprotectedフィールド
	 */
	public Rectangle(int x, int y, int width, int height) {

		this.p = new Point(x, y);
		this.width = width;
		this.height = height;
		angle = 4;
	}

	/**
	 * 概要:以下のようなメッセージを表示する。
	   出力例："[長方形(矩形)を描画] 点(0,0)を基準として幅100、高さ50の長方形"
	 * 引数:なし
	 * 戻り値:なし
	 * 修飾子:public
	 */
	public void draw() {
		System.out.println("[長方形(矩形)を描画] 点" + p + "を基準として幅" + width + "、高さ" + height + "の長方形");
	}

	/**
	 * 概要:横幅と縦幅を使い、以下の計算式で算出した結果を返す。
	　　　	  　( width + height ) * 2
	 *　引数:なし
	 * 戻り値:double
	 * 修飾子:public
	 */
	public double getPerimeter() {
		double perimeter = (width + height) * 2;
		return perimeter;
	}
}

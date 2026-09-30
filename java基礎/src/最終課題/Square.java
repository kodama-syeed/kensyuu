package 最終課題;

/**
 * 
 */
public class Square extends Rectangle {
	/**
	 * 概要:スーパークラスRectangleのコンストラクタを明示的に呼び出す。
	   引数は以下の通りとする。
	  　第1引数...Point型データのx座標
	  　第2引数...Point型データのy座標
	　  第3引数...正方形の一辺の長さ
	  　第4引数...正方形の一辺の長さ
	 * 引数:3つのint型
	 * 戻り値:なし
	 * 修飾子:public
	 * @param x:長方形の基準の位置を表すPoint型protectedフィールド
	 * @param y:長方形の基準の位置を表すPoint型protectedフィールド
	 * @param width:長方形の横幅を表すprotectedフィールド
	 */
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	/**
	 * 概要:以下のようなメッセージを表示する。
	　 "[正方形を描画] 点(0,0)を基準として幅・高さ200の正方形"
	 *　引数:なし
	 * 戻り値:なし
	 * 修飾子:public
	 */
	public void draw() {
		System.out.println("[正方形を描画] 点" + p + "を基準として幅・高さ" + width + "の正方形");
	}
}

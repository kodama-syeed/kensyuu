package 最終課題;

/**
 * 
 */
public class Square extends Rectangle {
	/**
	 * 概要:スーパークラスRectangleのコンストラクタを明示的に呼び出す。<br>
	   引数は以下の通りとする。<br>
	  　第1引数...Point型データのx座標<br>
	  　第2引数...Point型データのy座標<br>
	　  第3引数...正方形の一辺の長さ<br>
	  　第4引数...正方形の一辺の長さ<br>
	 * 引数:3つのint型<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * @param x:長方形の基準の位置を表すPoint型protectedフィールド<br>
	 * @param y:長方形の基準の位置を表すPoint型protectedフィールド<br>
	 * @param width:長方形の横幅を表すprotectedフィールド<br>
	 */
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	/**
	 * 概要:以下のようなメッセージを表示する。<br>
	　 "[正方形を描画] 点(0,0)を基準として幅・高さ200の正方形"<br>
	 *　引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public void draw() {
		System.out.println("[正方形を描画] 点" + this.p + "を基準として幅・高さ" + this.width + "の正方形");
	}
}

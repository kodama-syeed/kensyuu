package 最終課題;


public class Point {
	private int x;
	private int y;

	/**
	 * 概要:引数なしコンストラクタの定義x座標、y座標ともに0で初期化する。<br>
	 * 引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * 概要:x座標、y座標を受け取りその値で初期化するコンストラクタの定義<br>
	 * 引数:int x, int y<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * @param x:x座標を表すprivateフィールド<br>
	 * @param y:y座標を表すprivateフィールド<br>
	 * 
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	/**
	 * 概要:xフィールドの値を返すメソッド<br>
	 * 引数:なし<br>
	 * 戻り値:xフィールドの値(int)<br>
	 * 修飾子:public<br>
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * 概要:引数で渡された値を、xフィールドにセットするメソッド<br>
	 * 引数:int x<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * @param x:x座標を表すprivateフィールド<br>
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * 概要:yフィールドの値を返すメソッド<br>
	 * 引数:なし<br>
	 * 戻り値:yフィールドの値(int)<br>
	 * 修飾子:public<br>
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * 概要:引数で渡された値を、yフィールドにセットするメソッド<br>
	 * 引数:int y<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * @param y:y座標を表すprivateフィールド<br>
	 */
	public void setY(int y) {
		this.y = y;
	}

}

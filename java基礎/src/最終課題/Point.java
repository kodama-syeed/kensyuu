package 最終課題;

public class Point {
	private int x;
	private int y;

	/**
	 * 概要:引数なしコンストラクタの定義x座標、y座標ともに0で初期化する。
	 * 引数:なし
	 * 戻り値:なし
	 * 修飾子:public
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * 概要:x座標、y座標を受け取りその値で初期化するコンストラクタの定義
	 * 引数:int x, int y
	 * 戻り値:なし
	 * 修飾子:public
	 * @param x x座標を表すprivateフィールド
	 * @param y y座標を表すprivateフィールド
	 * 
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	/**
	 * 概要:xフィールドの値を返すメソッド
	 * 引数:なし
	 * 戻り値:xフィールドの値(int)
	 * 修飾子:public
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * 概要:引数で渡された値を、xフィールドにセットするメソッド
	 * 引数:int x
	 * 戻り値:なし
	 * 修飾子:public
	 * @param x x座標を表すprivateフィールド
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * 概要:yフィールドの値を返すメソッド
	 * 引数:なし
	 * 戻り値:yフィールドの値(int)
	 * 修飾子:public
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * 概要:引数で渡された値を、yフィールドにセットするメソッド
	 * 引数:int y
	 * 戻り値:なし
	 * 修飾子:public
	 * @param y y座標を表すprivateフィールド
	 */
	public void setY(int y) {
		this.y = y;
	}

}

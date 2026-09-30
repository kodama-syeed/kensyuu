package 最終課題;

public abstract class Polygon extends Shape {
	protected int angle;

	/**
	 *概要:図形描画機能の定義<br>
	 *引数:なし<br>
	 *戻り値:なし<br>
	 *修飾子:public abstract<br>
	 */
	public abstract void draw();

	/**
	 *概要:長さ測定機能の定義<br>
	 *引数:なし<br>
	 *戻り値:double<br>
	 *修飾子:public abstract<br>
	 */
	public abstract double getPerimeter();

	/**
	 * 概要:angleフィールドを使い、内角の和を算出する<br>
	 *   例）n角形の場合　　(n - 2) * 180<br>
	 * 引数:なし<br>
	 * 戻り値:算出された内角の和 (int型)<br>
	 * 修飾子:public<br>
	 * 
	 */
	public int getInternalAngle() {
		int Internalangle = (angle - 2) * 180;
		return Internalangle;
	}
}

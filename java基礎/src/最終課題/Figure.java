package 最終課題;

public interface Figure {
	
	/**
	 * 概要:図形描画機能の定義<br>
	 * 引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 */
	public abstract void draw();
	
	/**
	 * 概要:長さの測定機能の定義<br>
	 * 引数:なし<br>
	 * 戻り値:double<br>
	 * 修飾子:public<br>
	 */
	public abstract double getPerimeter();
	
}

package 最終課題;

public abstract class Shape implements Figure {
	/**
	 *図形描画機能の定義<br>
	 */
	public abstract void draw();

	/**
	 *長さ測定機能の定義<br>
	 */
	public abstract double getPerimeter();
}

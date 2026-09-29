package 最終課題;

/**
 * 
 */
public class Square extends Rectangle {
	public Square(int x, int y, int width) {
	super(x, y,width,width);
	}

	/**
	 * 以下のようなメッセージを表示する。
	　    * "[正方形を描画] 点(0,0)を基準として幅・高さ200の正方形"
	 */
	public void draw() {
		System.out.println("[正方形を描画] 点"+p+"を基準として幅・高さ"+width+"の正方形");
	}
}

package 最終課題;

public class Circle extends Shape {
	private Point center;
	private int radius;

	/**
	 * 概要引数なしコンストラクタの定義　center(x,y座標)、半径全て0で初期化する<br>
	 * 引数:なし<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * 
	 */
	public Circle() {
		this.center = new Point();
		this.radius = 0;
	}

	/**
	 * 概要:引数x,yで受け取ったデータを用いて、1つのPointオブジェクトを生成し、centerフィールドに代入する。引数rもradiusフィールドに代入する。<br>
	 * 引数:3つのint型データ<br>
	 * 戻り値:なし<br>
	 * 修飾子:public<br>
	 * @param x:円の中心を表すPoint型privateフィールド<br>
	 * @param y:円の中心を表すPoint型privateフィールド<br>
	 * @param r:円の半径を表すprivateフィールド<br>
	 */
	public Circle(int x, int y, int r) {

		this.center = new Point(x, y);
		r = this.radius;
	}

	/**
	* 概要:以下のようなメッセージを表示する。<br>
	  出力例："[円を描画] 中心点(100,100)から半径20"<br>
	* 引数:なし<br>
	* 戻り値:なし<br>
	* 修飾子:public<br>
	 */
	public void draw() {
		System.out.println("[円を描画] 中心点" + center + "から半径" + radius);
	}

	/**
	* 概要:半径を使い、以下の計算式で算出した結果を返す<br>
	　　　　  半径 * 2 * 円周率<br>
	* 引数:なし<br>
	* 戻り値:double<br>
	* 修飾子:public<br>
	 */
	public double getPerimeter() {
		double perimeter = Math.PI * radius * 2;
		return perimeter;
	}
}

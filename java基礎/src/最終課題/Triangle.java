package 最終課題;

public class Triangle extends Polygon {

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		angle = 3;
	}

	public void draw() {
		System.out.println("[三角形を描画] 点1"+p1+"から点2"+p2+"、点3"+p3+"の三角形");
	}

	public double getPerimeter() {
		double perimater = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY()).getPerimeter() +
				new Line(p2.getX(), p2.getY(), p3.getX(), p3.getY()).getPerimeter() +
				new Line(p3.getX(), p3.getY(), p1.getX(), p1.getY()).getPerimeter();
		return perimater;
	}
}

package 最終課題;

public class Circle extends Shape {
	private Point center;
	private int radius;

public  Circle() {
	this.center=new Point();
	this.radius=0;
}

public  Circle(int x,int y,int r) {
	
	this.center=new Point(x,y);
	r=this.radius;
}

	public void draw() {
		System.out.println("[円を描画] 中心点"+center+"から半径"+radius);
	}

	public double getPerimeter() {
		double perimeter = Math.PI * radius * 2;
		return perimeter;
	}
}

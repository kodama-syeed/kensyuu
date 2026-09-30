package 最終課題;

public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle(30, 50, 20);
		circle.draw();

		Square square = new Square(0, 0, 200);
		square.draw();
		
		Triangle triangle=new Triangle(1,2,3,4,5,6);
		triangle.draw();
	}
}
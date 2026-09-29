package 最終課題;

public abstract class Polygon extends Shape {
	protected int angle;

	public abstract void draw();

	public abstract double getPerimeter();

	public int getInternalAngle() {
		int Internalangle = (angle - 2) * 180;
		return Internalangle;
	}
}

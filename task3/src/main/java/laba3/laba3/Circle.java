package laba3.laba3;

public class Circle extends Shape {

	private double radius;

	public Circle() {

	}

	public Circle(final double radius, final String colorIn, final boolean filledIn) {
		this.radius = radius;
		color = colorIn;
		filled = filledIn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(final double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return super.getArea();
	}

	public double getPerimeter() {

		return super.getPerimeter();
	}

	public String toString() {

		return super.toString();
	}
}

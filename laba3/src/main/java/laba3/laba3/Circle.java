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
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}

	public String toString() {

		return super.toString();
	}
}

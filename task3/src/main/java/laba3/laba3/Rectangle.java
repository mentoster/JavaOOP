package laba3.laba3;

public class Rectangle extends Shape {

	private double width;
	private double length;

	public Rectangle() {

	}

	public Rectangle(final double width, final double length) {

	}

	public Rectangle(final double width, final double length, final String color2, final boolean filled2) {
		this.width = width;
		this.length = length;
		color = color2;
		filled = filled2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return (width * length) / 2;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	public String toString() {
		return super.toString();
	}

}

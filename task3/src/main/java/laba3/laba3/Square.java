package laba3.laba3;

public class Square extends Shape {

	private double side;
	private double width;
	private double length;

	public Square() {

	}

	public Square(final double side) {
		this.side = side;
	}

	public Square(final double side, final String color2, final boolean filled2) {
		this.side = side;
		color = color2;
		filled = filled2;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setWidth(double side) {
		this.width = side;
	}

	public void setLength(double side) {
		this.length = side;
	}

	public String toString() {
		return super.toString();
	}
}

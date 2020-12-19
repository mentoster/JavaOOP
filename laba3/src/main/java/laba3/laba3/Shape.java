package laba3.laba3;

public abstract class Shape {
	protected String color;
	protected boolean filled;

	public Shape() {

	}

	public Shape(final String color, final boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(final boolean filled) {
		this.filled = filled;
	}

	public double getArea() {
		
		return 0;
	}

	public double getPerimeter() {

		return 0;
	}

	@Override
	public String toString() {

		return super.toString();
	}

}

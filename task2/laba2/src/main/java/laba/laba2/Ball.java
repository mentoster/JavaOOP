package laba.laba2;

public class Ball {
	private double x = 0.0;
	private double y = 0.0;

	public Ball(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void move(final double xDisp, final double yDisp) {
		x += xDisp;
		y += yDisp;
	}

	@Override
	public String toString() {
		return "Ball @ (" + this.x + ", " + this.y + ").";
	}
}

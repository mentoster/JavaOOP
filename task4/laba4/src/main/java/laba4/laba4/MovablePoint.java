package laba4.laba4;

public class MovablePoint implements Movable {
	
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;

	public MovablePoint(final int x, final int y, final int xSpeed, final int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUP() {
		y += ySpeed;
	}

	@Override
	public void moveDown() {
		y -= ySpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}

	@Override
	public String toString() {
		return String
				.format("Точка с положением (" + x + "; " + y + ") и со скоростью (" + xSpeed + "; " + ySpeed + ")");
	}
}

package laba4.laba4;

public class MovableRectangle implements Movable {
	MovablePoint topleft;
	MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public void moveUP() {
		topleft.moveUP();
		bottomRight.moveUP();
	}

	@Override
	public void moveDown() {
		topleft.moveDown();
		bottomRight.moveDown();
	}

	@Override
	public void moveLeft() {
		topleft.moveLeft();
		bottomRight.moveLeft();
	}

	@Override
	public void moveRight() {
		topleft.moveRight();
		bottomRight.moveRight();
	}

	@Override
	public String toString() {
		return String.format("Квадрат определяемый точками: (" + topleft + ", " + bottomRight + ")");
	}
}

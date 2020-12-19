package laba4.laba4;

public class MovableCircle implements Movable {
	int radius;
	MovablePoint center;

	@Override
	public void moveUP() {
		center.moveUP();

	}

	@Override
	public void moveDown() {
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		center.moveRight();
	}

	@Override
	public String toString() {
		return String.format("Круг с центром в " + center.toString() + " с радиусом" + radius);
	}

}

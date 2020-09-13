package laba4.laba4;

public class start {
	public static void main(String[] args) {
		Movable figure = new MovableRectangle(0,0,2,2,1,1);
		figure.moveUP();
		System.out.println(figure.toString());
	}
}

package laba3.laba3;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class start {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());

		// Мы создали новый класс Shape на основе на Circle, у них действуют только
		// общие методы
		// для того, чтобы раборотал метод getRadius нам нужно создавать
		// не Shape s1 а Circle s1
		//
		// System.out.println(s1.getRadius());

		System.out.println("______________________");

		Circle c1 = (Circle) s1;
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		System.out.println("______________________");

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());

		// System.out.println(s3.getLength());
		// Мы создали класс Shape на основе Rectangle. Нам нужно создавать объект на
		// основе не Shape, а Rectangle.

		Rectangle r1 = (Rectangle) s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		System.out.println("______________________");

		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());

		// System.out.println(s4.getSide());
		// У объекта s4 нет метода getSide, так как он shape, а не square

		System.out.println("______________________");

		// Take note that we downcast Shape s4 to Rectangle,
		// which is a superclass of Square, instead of Square

		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());

		// у метода Rectangle нет функции getSide()
		// System.out.println(r2.getSide());

		System.out.println("______________________");
		System.out.println(r2.getLength());

		// Невозможно преобразовать Square в Square
		// Square sq1 = (Square) r2;

		// System.out.println(sq1);
		// System.out.println(sq1.getArea());
		// System.out.println(sq1.getColor());
		// System.out.println(sq1.getSide());
		// // Метод getLength () не определен для типа Square
		// System.out.println(sq1.getLength());

	}

}

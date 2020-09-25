package laba.laba6;

import java.util.Scanner;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Laba6Application {

	public static void main(final String[] args) {
		final var auto = true;
		// import java.util.Scanner;
		final Scanner in = new Scanner(System.in);

		System.out.print("Задание 4. Заданная сумма цифр\nВведите k\n");
		final var k = auto ? 4 : in.nextInt();
		System.out.print("Ваше число: " + k);
		System.out.print("Введите s\n");
		final var s = auto ? 16 : in.nextInt();
		System.out.print("Ваше число: " + s);
		final task4 Task1 = new task4(k, s);
		System.out.print(Task1.toString());

		System.out.print("\nЗадание 5. Сумма цифр числа\nВведите число\n");
		final int numbers = auto ? 112 : in.nextInt();
		System.out.print("Ваше число: " + numbers);
		final task5 result5 = new task5(numbers);
		System.out.print(result5.toString());

		System.out.print("\nЗадание 6.Проверка числа на простоту\nВведите число\n");
		final int isPrime = auto ? 100 : in.nextInt();
		System.out.print("Ваше число: " + isPrime);
		final task6 result6 = new task6(isPrime);
		System.out.print(result6.toString());
		System.out.print("\nЗадание 7.Разложение на множители\nВведите число\n");
		final int mno = auto ? 100 : in.nextInt();
		System.out.print("Ваше число: " + mno);
		final task7 result7 = new task7(mno);
		System.out.print(result7.toString());
		in.close();

	}

}

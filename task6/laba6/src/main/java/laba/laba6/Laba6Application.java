package laba.laba6;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
:::'##:::::::::::::::::'########:
::: ##:::'##::::::::::: ##..  ##:
::: ##::: ##:::::::::::..:: ##:::
::: ##::: ##::'#######:::: ##::::
::: #########:........::: ##:::::
:::...... ##::::::::::::: ##:::::
::::::::: ##::::::::::::: ##:::::
:::::::::..::::::::::::::..::::::
*/
@SpringBootApplication
public class Laba6Application {

	public static void main(final String[] args) {
		// import java.util.Scanner;
		final Scanner in = new Scanner(System.in);
		System.out.print("Задание 1. Заданная сумма цифр\nВведите k\n");
		final var k = in.nextInt();
		System.out.print("Введите d\n");
		final var d = in.nextInt();
		final task4 Task1 = new task4(k, d);
		System.out.print(Task1.toString());
		System.out.print("\n\nЗадание 2. Сумма цифр числа\n");

	}

}

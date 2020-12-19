package laba.laba8;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.util.Scanner;

@SpringBootApplication
public class Laba8Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите имя файла в папке OOP");
		String name = scanner.next();
		File file = new File("C:/Users/Public/Desktop/" + name);
		if (!file.exists() || file.isDirectory()) {
			scanner.close();
			System.out.println("Файл не найден");
			System.out.println("Задача не выполнена");
			return;
		}
		try (FileWriter writer = new FileWriter(file, false)) {
			System.out.println("Текстовый файл открыт");
			System.out.println("Введите свой текст:");
			writer.write(scanner.next() + scanner.nextLine());
			writer.flush();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Задача выполнена");
		scanner.close();
	}

}

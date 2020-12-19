package laba.laba6;
// Дано натуральное число N.Вычислите сумму его цифр.При решении этой задачи нельзя использовать строки,списки,массивы(ну и циклы,разумеется)
public class task5 {

	private final int numbers;
	private int res = 0;

	public task5(final int numbers) {
		this.numbers = numbers;
	}

	private void recursion(int number) {
		if (number > 0) {
			res += number % 10;
			number /= 10;
			recursion(number);
		}
	}

	@Override
	public String toString() {
		recursion(numbers);
		return "Сумма цифр в числе " + numbers + " равна: " + res + "\n";
	}
}

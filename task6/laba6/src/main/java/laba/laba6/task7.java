package laba.laba6;

import java.util.Vector;

// Дано натуральное число n>1. Выведите все простые множители этого числа в порядке не убывания с учетом кратности.Алгоритм должен иметь сложность O(log n)
public class task7 {

	private int number;

	private Vector<Integer> arr = new Vector<>();

	public task7(final int number) {
		this.number = number;
	}

	private void CountBunch() {
		while (number > 1)
			for (int i = 2; i <= 10; i++)
				if (number % i == 0) {
					arr.add(i);
					number /= i;
				}
	}

	@Override
	public String toString() {
		CountBunch();
		String sum = "";
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.elementAt(i);
			if (i != arr.size() - 1)
				sum += '*';
		}
		return "\nРезультат " + sum + "\n";
	}

}

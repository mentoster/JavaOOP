package laba.laba6;

import java.lang.Math;

// Дано натуральное число n>1. Проверьте,является ли оно простым.Программа должна вывести слово YES,если число простое и NO,если число составное.Алгоритм должен иметь сложность O(logn).
public class task6 {

	private int num;

	public task6(int num) {
		this.num = num;
	}

	boolean IsPrime(int n) {
		int min_divisor = 1;
		int sqrt_n = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt_n; i++) {
			if (n % i == 0) {
				min_divisor = i;
				break;
			}
		}
		if (min_divisor == 1)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return IsPrime(num) ? "\nYes" : "\nNo";
	}
}

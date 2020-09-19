package laba.laba6;

import java.lang.Math;

/*
'##::::::::
 ##:::'##::
 ##::: ##::
 ##::: ##::
 #########:
...... ##::
:::::: ##::
::::::..:::
*/
// 4. Заданная сумма цифр
// Даны натуральные числа k и s.Определите,
// сколько существует k-значных натуральных чисел,сумма цифр которых
// равна d.Запись натурального числа не может начинаться с цифры 0. В
// этой задаче можно использовать цикл для перебора всех цифр,стоящих
// на какой-либо позиции
public class task4 {

	private  int k;
	private  int d;
	private double result;

	public task4(final int k, final int d) {
		this.k = k;
		this.d = d;
	}

	private void count() {
		double i = Math.pow(10, k - 1);
		while (i < Math.pow(10, k)) {
			double ssum = 0, num = i;
			while (num > 0) {
				ssum += num % 10;
				num /= 10;
			}
			if (ssum == d) {
				result++;
			}
			i++;
		}
	}

	public int getK() {
		return this.k;
	}

	public int getD() {
		return this.d;
	}



	@Override
	public String toString() {
		count();
		return "Существует " + result + " значений(ия)\n";
	}
}

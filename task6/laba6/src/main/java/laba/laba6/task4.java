package laba.laba6;



// 4. Заданная сумма цифр
// Даны натуральные числа k и s.Определите,
// сколько существует k-значных натуральных чисел,сумма цифр которых
// равна d.Запись натурального числа не может начинаться с цифры 0. В
// этой задаче можно использовать цикл для перебора всех цифр,стоящих
// на какой-либо позиции
public class task4 {

	private int k;
	private int s;

	public task4(int k, int s) {
		this.s = s;
		if (k == 0) {
			System.out.print("k не может равняться нулю, ваше k сброшена до 1");
			k = 1;
		}
		this.k = k;
	}

	private int count(int len, int sum) {
		if (len == k)
			if (sum == s)
				return 1;
			else
				return 0;
		int c = (len == 0 ? 1 : 0);
		int result = 0;
		for (int i = c; i < 10; i++)
			result += count(len + 1, sum + i);
		return result;
	}


	@Override
	public String toString() {
		int answer = count(0, 0);
		return "Существует " + answer + " значений(ия)\n";
	}
}

package by.ld.les04.main;
/*
 * С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от
 1 до 99 включительно.
 */
public class Task05 {

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;

		while (a <= 99) {
			if (a % 2 != 0) {
				System.out.println(a);
				sum += a;
			}
			a++;
		}
		System.out.println("Сумма нечетных чисел от 0 до 99" + sum);
	}
}



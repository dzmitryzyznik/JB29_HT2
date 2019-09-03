package by.ld.les04.main;
/*
 * Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на
 их произведение. Найти эти числа.
 */
public class Task36 {

	public static void main(String[] args) {
		int a;
		int b;
		
		int y;

		int x1 = 0;
		int x2 = 0;

		for (int i = 1000; i <= 9999; i++) {
			b = i;
			for (int j = 1; j <= 2; j++) {

				a = b % 10;

				if (j == 2) {
					x1 = a * 10 + x1;
				} else {
					x1 = a;
				}
				b /= 10;

			}
			for (int k = 1; k <= 2; k++) {

				a = b % 10;

				if (k == 2) {
					x2 = a * 10 + x2;
				} else {
					x2 = a;
				}
				b /= 10;

			}

			y = x1 * x2;

			if (y != 0 && i % y == 0) {
				System.out.println(i);
			}
		}

	}

}

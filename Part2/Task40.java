package by.ld.les04.main;

/*
 * Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
 */
import java.util.Scanner;
public class Task40 {

	public static void main(String[] args) {

		
		int a;
		int b;
		boolean x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число N");
		int N = sc.nextInt();
		System.out.println("Все числа, которые делятся без остатка на все свои цифры и меньше N: ");

		for (int i = 1; i <= N; i++) {
			a = i;
			x = true;

			while (a > 0) {
				b = a % 10;
				a /= 10;

				if (b != 0 && i % b != 0) {
					x = false;
				}
			}
			if (x != false)
				System.out.println(i);
		}

	}

}

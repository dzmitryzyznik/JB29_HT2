package by.ld.les03.main;
/*
 * Вычислить значение функции:
 */

import java.util.Scanner;
public class Task40 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		double x = sc.nextDouble();
		if (x <= 13) {
			double x1 = -Math.pow(x, 3) + 9;
			System.out.println("F = " + x1);
		}
		else if (x > 13) {
			double x2 = - (3 / (x + 1));
			System.out.println("F = " + x2);
	}
}
}

package by.ld.les04.main;
/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
import java.util.Scanner;
public class Task07 {

	public static void main(String[] args) {
		
		double y;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		double a = sc.nextDouble();
		System.out.println("Введите b");
		double b = sc.nextDouble();
		System.out.println("Введите шаг h");
		double h = sc.nextDouble();

		for (double x = a; x <= b; x = x + h) {
			if (x > 2) {
				y = x;
				System.out.println("y = " + y);
			} else {
				y = -x;
				System.out.println("y = " + y);
			}
		}

	}

}

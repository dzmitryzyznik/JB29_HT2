package by.ld.les04.main;
/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
import java.util.Scanner;
public class Task08 {

	public static void main(String[] args) {
		
		
		double y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		int a = sc.nextInt();
		System.out.println("Введите b");
		int b = sc.nextInt();
		System.out.println("Введите шаг h");
		double h = sc.nextDouble();
		int c = 3;

		for (double x = a; x <= b; x = x + h) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("y = " + y);
			} else
				y = (x - c) + 6;
			System.out.println("y = " + y);
		}

	}

}

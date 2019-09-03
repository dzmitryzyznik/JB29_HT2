package by.ld.les03.main;
/*
 *  Вычислить значение функции:
 */
import java.util.Scanner;
public class Task39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		double x = sc.nextDouble();
		if (x >= 8) {
			double x1 = -Math.pow(x, 2) + x - 9;
			System.out.println("F = " + x1);
		}
		else if (x < 8) {
			double x2 = 1 / (Math.pow(x, 4) - 6);
			System.out.println("F = " + x2);
		}

	}

}

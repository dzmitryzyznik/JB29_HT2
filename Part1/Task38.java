package by.ld.les03.main;
/*
 * Вычислить значение функции:
 */
import java.util.Scanner;
public class Task38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		double x = sc.nextDouble();
		if (0 <= x && x <= 3) {
			double x1 = Math.pow(x, 2);
			System.out.println("F = " + x1);
		}
		else if (x > 3 | x < 0) {
			double x2 = 4;
			System.out.println("F = " + x2);
		}
		}

	}



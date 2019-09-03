package by.ld.les04.main;

/*
 * Найдите наибольшую цифру данного натурального числа.
 */
import java.util.Scanner;
public class Task33 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int a = sc.nextInt();
		int y = 0;

		for (int i = 0; a > 0; i++) {
			x = a % 10;
			if (x > y) {
				y = x;
			}
			a /= 10;
		}
		System.out.println("Наибольшая цифра числа = " + y);


	}

}

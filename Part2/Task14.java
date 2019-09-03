package by.ld.les04.main;
/*
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		
		double x = 1;
		double i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		double n = sc.nextDouble();
		double i1 = 0;

		while (x <= n) {
			i = 1 / x;
			i1 = i1 + i;
			x++;
		}
		System.out.println(i1);

	}

}

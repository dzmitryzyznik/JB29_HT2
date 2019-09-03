package by.ld.les04.main;
/*
 * Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
 */
import java.util.Scanner;
public class Task17 {

	public static void main(String[] args) {
		
		
		double x = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите а");
		double a = sc.nextDouble();
		System.out.println("Введите n");
		double n = sc.nextDouble();

		for (double i = 0; i < n; i++) {
			x = x * (a + i);
		}
		System.out.println(x);
	}

}

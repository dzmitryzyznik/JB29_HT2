package by.ld.les03.main;
/*
 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными
значениями, если это не так.

 */
import java.util.Scanner;
public class Task30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		int a = sc.nextInt();
		System.out.println("Введите b");
		int b = sc.nextInt();
		System.out.println("Введите c");
		int c = sc.nextInt();
		if (a > b && b > c) {
			a = a * a;
			b = b * b;
			c = c * c;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}

}

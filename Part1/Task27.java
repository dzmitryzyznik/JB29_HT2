package by.ld.les03.main;
/*
 * Найти max{min(a, b), min(c, d)}.
 */
import java.util.Scanner;
public class Task27 {
	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		int a = sc.nextInt();
		System.out.println("Введите b");
		int b = sc.nextInt();
		System.out.println("Введите c");
		int c = sc.nextInt();
		System.out.println("Введите d");
		int d = sc.nextInt();
		if ( a > b) {
			x = b;
		}
		else {
			x = a;
		} 
		if ( c > d) {
			y = d;
		}
		else {
			y = c;
		}
		if (x > y) {
			System.out.println("max = " + x);
		}
		else {
			System.out.println("max = " + y);
		}
	
	}
}

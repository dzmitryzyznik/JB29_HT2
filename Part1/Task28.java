package by.ld.les03.main;

import java.util.Scanner;

/*
 * Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
 */
public class Task28 {

	public static void main(String[] args) {
		int a, b, c, d, a1, a2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		a = sc.nextInt();
		System.out.println("Введите b");
		b = sc.nextInt();
		int x, y, z;
		System.out.println("Введите c");
		c = sc.nextInt();
		System.out.println("Введите d");
		d = sc.nextInt();
		if ( a == d ) {
			System.out.println("a = d");	
		}
		else if ( b == d ) {
			System.out.println("b = d");	
		}
		else if (c == d) {
			System.out.println("c = d");
		}
		else {
			a1 = Math.max(d - a, d - b);
			a2 = Math.max(a1, d - c);
			System.out.println("Max = " + a2);
		}

	}

}

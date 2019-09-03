package by.ld.les03.main;

import java.util.Scanner;

/*
 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
 */
public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите m");
		int m = sc.nextInt();
		System.out.println("Введите n");
		int n = sc.nextInt();
		int x;
		
		if (m > n) {
			 x = m;
		}
		else {
			x = n;
		}
		
		if (m != n) {
			m = x;
			n = x;
			
		}
		else {
			m = 0;
			n = 0;
		}
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);

	}

}

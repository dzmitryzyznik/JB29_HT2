package by.ld.les03.main;

import java.util.Scanner;

/*
 * Подсчитать количество отрицательных среди чисел а, b, с.
 */
public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		int a = sc.nextInt();
		System.out.println("Введите b");
		int b = sc.nextInt();
		System.out.println("Введите c");
		int c = sc.nextInt();
		
		int i = 0;
		
		if (a < 0) {
			i = i + 1;
		}
		if (b < 0) {
			i = i +1;
		}
		if (c < 0) {
			i = i +1;
		}
		System.out.println(i);
	}

}

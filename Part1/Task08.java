package by.ld.les03.main;

import java.util.Scanner;

/*
 * Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */
public class Task08 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число a");
		int a = sc.nextInt();
		
		System.out.println("Введите число b");
		int b = sc.nextInt();
		
		if (Math.pow(a, 2) > Math.pow(b, 2)) {
			System.out.println("Квадрат числа b меньше");
		}
		else {
			System.out.println("Квадрат числа a меньше");
		}

	}

}

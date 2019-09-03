package by.ld.les03.main;
/*
 * Составить программу: определения наименьшего из двух чисел а и b.
 */

import java.util.Scanner;

public class Task05 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число a");
		int a = sc.nextInt();
		
		System.out.println("Введите число b");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("Число a меньше");
		}
		else if (a > b) {
			System.out.println("Число b меньше");
	}
		else if (a == b) {
			System.out.println("Числа равны");
	}
		

}
}
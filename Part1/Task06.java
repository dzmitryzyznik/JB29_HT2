package by.ld.les03.main;

import java.util.Scanner;

/*
 * Составить программу: определения наибольшего из двух чисел а и b.
 */
public class Task06 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число a");
		int a = sc.nextInt();
		
		System.out.println("Введите число b");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("Число b больше");
		}
		else if (a > b) {
			System.out.println("Число a больше");
	}
		else if (a == b) {
			System.out.println("Числа равны");
	}
		

}
}
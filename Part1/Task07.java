package by.ld.les03.main;

import java.util.Scanner;

/*
 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */
public class Task07 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число a");
		int a = sc.nextInt();
		
		System.out.println("Введите число b");
		int b = sc.nextInt();
		
		System.out.println("Введите число c");
		int c = sc.nextInt();
		
		System.out.println("Введите число x");
		int x = sc.nextInt();
		
		int n = a * x * x +b * x + c;
		
		if (n < 0) {
			System.out.println("Выражение равно " + Math.abs(n));
		}
		
		else {
			System.out.println("Выражение равно " + n);
		}
		

	}

}

package by.ld.les03.main;

import java.util.Scanner;

/*
 * Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
 */
public class Task32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		int x = sc.nextInt();
		System.out.println("Введите y");
		int y = sc.nextInt();
		System.out.println("Введите z");
		int z = sc.nextInt();
		int x1 = x + y;
		int x2 = x + z;
		int x3 = z + y;
	
		if (x2 > 0) {
			System.out.println("Сумма положительная = " + x2);	
		}
		else if (x3 > 0) {
			System.out.println("Сумма положительная = " + x3);
		}
		else if (x1 > 0) {
			
			System.out.println("Сумма положительная = " + x1);
		}
		else {
			System.out.println("Сумма не является положительной");
		}
			
		
	}

}

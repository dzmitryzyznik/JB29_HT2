package by.ld.les04.main;
/*
 * Напишите программу, где пользователь вводи тлюбое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
import java.util.Scanner;
public class Task06 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое положительное число");
		a = sc.nextInt();
		
		while (x < a) {
			sum += x;
			x++;
		}
		System.out.println(sum);

	}

}

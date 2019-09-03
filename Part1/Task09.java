package by.ld.les03.main;
/*
 * Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
 */
import java.util.Scanner;
public class Task09 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите сторону a");
		int a = sc.nextInt();
		
		System.out.println("Введите сторону b");
		int b = sc.nextInt();
		
		System.out.println("Введите сторону c");
		int c = sc.nextInt();
		
		if (a == b && b ==c) {
			System.out.println("Треугольник равносторонний");
		}
		else {
			System.out.println("Треугольник не равносторонний");
		}

	}

}

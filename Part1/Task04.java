package by.ld.les03.main;
/*
 * Составить программу: равны ли два числа а и b?
 */
import java.util.Scanner;
public class Task04 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число a");
		int a = sc.nextInt();
		
		System.out.println("Введите число b");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("Числа не равны,a меньше чем b");
		}
		else if (a > b) {
			System.out.println("Числа не равны,a больше чем b");
	}
		else if (a == b) {
			System.out.println("a равно b");
	}
		

}
}
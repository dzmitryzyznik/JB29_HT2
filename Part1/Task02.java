package by.ld.les03.main;
/*
 * Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»
 */
import java.util.Scanner;
public class Task02 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число");
		int a = sc.nextInt();
		
		System.out.println("Введите второе число");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
	}

}
}
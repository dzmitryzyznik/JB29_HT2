package by.ld.les04.main;
/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
import java.util.Scanner;
public class Task27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите m");
		int m = sc.nextInt();
		System.out.println("Введите n");
		int n = sc.nextInt();

		for (int i = m; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0 && j != 1 && j != i) {
					System.out.println("Делитель для " + i + " : " + j);
				}
			}

		}

	}
}

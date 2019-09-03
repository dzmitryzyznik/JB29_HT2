package by.ld.les04.main;
/*
 * Составить программу нахождения разности кубов первых двухсот чисел
 */
public class Task11 {

	public static void main(String[] args) {
		
		int b;
		int a = 1;
		int c = 1;

		while (a <= 200) {
			b = a * a * a;
			c = c - b;
			a++;
		}
		System.out.println("Разность кубов первых двухсот чисел = " + c);

	}

}

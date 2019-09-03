package by.ld.les04.main;
/*
 * Найти сумму квадратов первых ста чисел.
 */
public class Task09 {

	public static void main(String[] args) {
		
		int b;
		int a = 1;
		int c = 0;

		while (a <= 100) {
			b = a * a;
			c += b;
			a++;
		}
		System.out.println("сумма квадратов первых ста чисел = " + c);

	}

}

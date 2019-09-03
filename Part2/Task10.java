package by.ld.les04.main;
/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task10 {

	public static void main(String[] args) {
		
		long b;
		long a = 1;
		long c = 1;
		
		while (a <= 200) { 
			b = a * a;
			c = b * c;
			a++;
		}
		System.out.println("Произведения квадратов первых двухсот чисел = " + c);

	}



}



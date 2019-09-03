package by.ld.les04.main;
/*
 * Вычислить : 1+2+4+8+...+ 2 в 10 степени.
 */
public class Task15 {

	public static void main(String[] args) {
		int b = 0;
		int x = 2;
		int y = 0;
		do {
			y = y + (int)Math.pow(x, b);
			b = b + 1;
		} while (b <= 10);
		System.out.println(y);

	}

}

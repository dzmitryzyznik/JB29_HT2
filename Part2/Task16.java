package by.ld.les04.main;
/*
 * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */
public class Task16 {

	public static void main(String[] args) {
		long c = 1;
		long x = 1;
		long b = 2;

		while (b <= 10) {
			c =c + b;
			x = x * c;
			b++;
			System.out.println(x);

		}
		System.out.println(x);

	}

}

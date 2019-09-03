package by.ld.les04.main;
/*
 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности.
 */
public class Task12 {

	public static void main(String[] args) {

		int an;
		
		int a1 = 1;
		int a = 2;
		int x = 1;

		while (a <= 11) {
			an = 6 + (a1);
			a1 = an;
			x = x * an;
			a++;
		}
		System.out.println(x);

	}

}

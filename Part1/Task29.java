package by.ld.les03.main;
/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
import java.util.Scanner;
public class Task29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x1");
		int x1 = sc.nextInt();
		System.out.println("Введите y1");
		int y1 = sc.nextInt();
		System.out.println("Введите x2");
		int x2 = sc.nextInt();
		System.out.println("Введите y2");
		int y2 = sc.nextInt();
		System.out.println("Введите x3");
		int x3 = sc.nextInt();
		System.out.println("Введите y3");
		int y3 = sc.nextInt();
		int a = (y2 - y1) / (x2 -x1);
		int b = y1 - (a * x1);
		int z3 = a * x3 + b;
		if (z3 == y3) {
		System.out.println("Точки расположены на одной прямой");
	}
		else {
		System.out.println("Точки не расположены на одной прямой");
	}

	}

}

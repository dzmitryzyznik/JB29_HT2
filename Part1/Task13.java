package by.ld.les03.main;
/*
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
 */
import java.util.Scanner;
public class Task13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите x1 ");
		double x1 = sc.nextDouble();
		
		System.out.println("Введите y1");
		double y1 = sc.nextDouble();
		
		System.out.println("Введите x2");
		double x2 = sc.nextDouble();
		
		System.out.println("Введите y2");
		double y2 = sc.nextDouble();
		
		double a = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		
		double b = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		
		if (a > b) {
			System.out.println("Точка B ближе");
		}
		if (a < b) {
			System.out.println("Точка A ближе");
		}
		else {
			System.out.println("Точки находятся на одинаковом расстоянии");
		}

	}

}

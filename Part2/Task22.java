package by.ld.les04.main;
/*
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
 */
import java.util.Scanner;
public class Task22 {

	public static void main(String[] args) {
		
        double fx;
        double x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите h");
        double h = sc.nextDouble();
        System.out.println("x " + "                  " + "f(x)");

        for (double i = a; i <= b; i += h) {
            x = i;
            x = Math.toRadians(x);
            fx = Math.pow(Math.toDegrees(Math.sin(x)), 2);
            System.out.println(x + " " + fx);
        }

	}

}

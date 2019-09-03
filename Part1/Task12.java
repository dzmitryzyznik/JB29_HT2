package by.ld.les03.main;
/*
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
 */
import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число ");
		double a = sc.nextDouble();
		
		System.out.println("Введите второе число");
		double b = sc.nextDouble();
		
		System.out.println("Введите третье число");
		double c = sc.nextDouble();
		
		if (a > 0 ) {
			a = Math.pow(a, 2);
		}
		else {
			a = Math.pow(a, 4);
		}
		
		if (b > 0 ) {
			b = Math.pow(b, 2);
		}
		else {
			b = Math.pow(b, 4);
		}
		
		
		if (c > 0 ) {
			c = Math.pow(c, 2);
		}
		else {
			c = Math.pow(c, 4);
		}
		
		System.out.println("Перво число = " + a);
		System.out.println("Второе число = " + b);
		System.out.println("Третье число = " + c);

	}

}

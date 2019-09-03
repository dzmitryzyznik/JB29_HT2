package by.ld.les04.main;
/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 */
import java.util.Scanner;
public class Task19 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите e");
        double e = sc.nextDouble();
        int n = 0;
        double x = 0;
        for (int i = 0; i <= 10; i++) {
            n++;
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (e <= Math.abs(a)) ;
            x = x + a;
            System.out.println(x);
        }

	}

}

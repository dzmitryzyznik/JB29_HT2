package by.ld.les04.main;
/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 */

public class Task20 {
	public static void main(String[] args) {
	
    double e = Math.exp(1);
    int n = 0;
    double x = 0;
    for (int i = 0;i <= 10; i++) {
        n++;
        double a = 1 / ((3 * n - 2) * (3 * n + 1));
        if (e <= Math.abs(a)) ;
        x = x + a;
        System.out.println(x);
    }
}
}
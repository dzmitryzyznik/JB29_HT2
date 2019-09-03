package by.ld.les03.main;
/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите угол A ");
		int a = sc.nextInt();
		
		System.out.println("Введите угол B");
		int b = sc.nextInt();
		
		int c = 180 - a - b;
		
	    if (a + b + c > 180 | a <= 0 | b <= 0 | c <= 0) {
	        System.out.println("Треугольника не сущевствует");
	      } else if (a == 90 | b == 90 | c == 90) {
	        System.out.println("Треугольник прямоугольный");
	      } else {
	        System.out.println("Треугольник сущевствует");
	      }
	    }
	}



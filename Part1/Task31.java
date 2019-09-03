package by.ld.les03.main;
/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
import java.util.Scanner;
public class Task31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите высоту А");
		int A = sc.nextInt();
		System.out.println("Введите ширину Б");
		int B = sc.nextInt();
		System.out.println("Введите длинну x");
		int x = sc.nextInt();
		System.out.println("Введите ширину y");
		int y = sc.nextInt();
		System.out.println("Введите высоту z");
		int z = sc.nextInt();
		 if (x <= A && y <= B ) {
			 System.out.println("Пройдет");
		 }
		 else if (y <= A && x <= B ) {
			 System.out.println("Пройдет");
		 }
		 else if (x <= A && z <= B ) {
			 System.out.println("Пройдет");
		 }
		 else if (z <= A && x <= B ) {
			 System.out.println("Пройдет");
		 }
		 else if (y <= A && z <= B ) {
			 System.out.println("Пройдет");
		 }
		 else if (z <= A && y <= B ) {
			 System.out.println("Пройдет");
		 }
		 else {
			 System.out.println("Не пройдет");
		 }
	}

}

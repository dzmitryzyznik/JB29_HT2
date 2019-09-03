package by.ld.les03.main;
/*
 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */
import java.util.Scanner;
public class Task22 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		int x = sc.nextInt();
		System.out.println("Введите y");
		int y = sc.nextInt();
		int x1 = y;
		int y1 = x;
		if (x > y) {
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
		else if (x < y) {
			
			System.out.println( "x = " + x1);
			System.out.println("y = " + y1);
		}
		else {
			System.out.println( "x = y" );
		}

	}

}

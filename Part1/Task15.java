package by.ld.les03.main;
/*
 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */
import java.util.Scanner;
public class Task15 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число x ");
		double x = sc.nextInt();
		
		System.out.println("Введите число y");
		double y = sc.nextInt();
		
		if (x < y) {
			double x1 = (x + y) / 2;
			y = (x * y) * 2;
			
			System.out.println("x = " + x1);
			System.out.println("y = " + y);
		}
		else {
			double y1 = (x + y) / 2;
			x = (x * y) * 2;
			
			System.out.println("x = " + x);
			System.out.println("y = " + y1);
		}
		
	    }
	}



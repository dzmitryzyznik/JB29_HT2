package by.ld.les03.main;
/*
 * Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
 */
import java.util.Scanner;
public class Task03 {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Введите число a");
			int a = sc.nextInt();
			
			int b = 3;
			
			if (a < b) {
				System.out.println("yes");
			}
			else if (b < a) {
				System.out.println("no");
		}

	}
	

	}



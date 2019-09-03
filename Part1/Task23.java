package by.ld.les03.main;
/*
 * Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
 */
import java.util.Scanner;
public class Task23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число");
		int d = sc.nextInt();
		System.out.println("Введите месяц");
		int m = sc.nextInt();
		
		if(d <= 31 & d >= 1 & m <= 12 & m >= 1){
			System.out.println("Дата верна");
		}
		else {
			System.out.println("Некорректная дата");
		}

	}

}

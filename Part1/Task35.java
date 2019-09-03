package by.ld.les03.main;

import java.util.Scanner;

/*
 * Вычислить число и месяц в невисокосном году по номеру дня.
 */
public class Task35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер дня");
		int a = sc.nextInt();
		int month31  = 31;
		int feb = 29;
		int month30 = 30;
		
		if (a >= 1 & a <= 31) {
			System.out.println(a + " Января");
		}
		if (a >= 32 & a <= 60) {
			a = a - month31;
			System.out.println(a + " Февраля");
		}
		if (a >= 61 & a <= 91) {
			a = a - month31 - feb;
			System.out.println(a + " Марта");
		}
		if (a >= 92 & a <= 121) {
			a = a - month31 * 2 - feb;
			System.out.println(a + " Апреля");
		}
		if (a >= 122 & a <= 152) {
			a = a - month31 * 2 - feb - month30;
			System.out.println(a + " Мая");
		}
		if (a >= 153 & a <= 182) {
			a = a - month31 * 3 - feb - month30;
			System.out.println(a + " Июня");
		}
		if (a >= 183 & a <= 213) {
			a = a - month31 * 3 - feb - month30 * 2;
			System.out.println(a + " Июля");
		}
		if (a >= 214 & a <= 244) {
			a = a - month31 * 4 - feb - month30 * 2;
			System.out.println(a + " Августа");
		}
		if (a >= 245 & a <= 274) {
			a = a - month31 * 5 - feb - month30 * 2;
			System.out.println(a + " Сентября");
		}
		if (a >= 274 & a <= 305) {
			a = a - month31 * 5 - feb - month30 * 3;
			System.out.println(a + " Октября");
		}
		if (a >= 305 & a <= 335) {
			a = a - month31 * 6 - feb - month30 * 3;
			System.out.println(a + " Ноября");
		}
		if (a >= 335 & a <= 366) {
			a = a - month31 * 6 - feb - month30 * 4;
			System.out.println(a + " Декабря");
		}
	}

}

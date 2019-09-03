package by.ld.les03.main;
/*
 * Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
 */
import java.util.Scanner;
public class Task33 {

	public static void main(String[] args) {
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите пароль");
		p = sc.nextInt();
		if (p == 9583 | p == 1747) {
			System.out.println("доступны модули баз А, В, С");
		}
		else if (p == 3331 | p == 7922) {
			System.out.println("доступны модули баз В, С");
		}
		else if (p == 9455 | p == 8997) {
		System.out.println("доступны модули базы С");

	}
	else {
		System.out.println("Пароль не верный");
	}
}
}
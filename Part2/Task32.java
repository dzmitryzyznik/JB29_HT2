package by.ld.les04.main;
/*
 * Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами
 и знаком подчеркивания.
 */
import java.util.Scanner;
public class Task32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку > ");
		String ch1 = sc.nextLine();

		int a = (int) ch1.charAt(0);
		for (int i = 48; i <= 57; i++) {
			if (a == i) {

				char x = (char) a;
				System.out.println("Недопустимый символ " + x);
			}

		}

	}

}

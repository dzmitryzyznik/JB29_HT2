package by.ld.les04.main;

import java.util.Scanner;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а ");
        String a = scanner.nextLine();
        System.out.println("Введите b ");
        String b = scanner.nextLine();

        for (int n = 0; n < a.length(); n++) {
            a.charAt(n);
        }
        for (int m = 0; m < b.length(); m++) {
            b.charAt(m);
        }
        System.out.println("одинаковые числа в числах a and b ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(b.charAt(j));
                }
            }
        }
    }
}

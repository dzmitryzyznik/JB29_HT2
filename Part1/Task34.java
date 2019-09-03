package by.ld.les03.main;
/*
 * Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */
import java.util.Scanner;
public class Task34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стоимость книги");
		double a = sc.nextDouble();
		System.out.println("Введите сумму оплаты");
		double b = sc.nextDouble();
		double c = a - b;
		if (c == 0) {
			System.out.println("спасибо");}
			else if (c > 0) {
				System.out.println("денег недостаточно " + c);
			}
			else if (c < 0) {
				System.out.println("возьмите сдачу " + Math.abs(c));
			}
			
	}

}

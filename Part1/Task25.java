package by.ld.les03.main;
/*
 * Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.
 */
import java.util.Scanner;
public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите температуру в помещении");
		int t = sc.nextInt();
		if (t > 60) {
			System.out.println("Пожароопасная ситуация");
		}
		else {
			System.out.println("Все нормуль");
		}
	}

}

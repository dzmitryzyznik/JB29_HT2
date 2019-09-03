package by.ld.les04.main;
/*
 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его вдругое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.
 */
import java.util.Scanner;
public class Task24 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Введите a");
	    String a = sc.nextLine();
	    int  x = 0;

	    for (int i = 0; i < a.length(); i++){
	        a.charAt(i);
	        for (int j = 0; j < a.length(); j++){
	            if (j % 2 ==0 ){
	                x = x + j;

	                System.out.println(x);
	            }
	        }
	}
	}

}

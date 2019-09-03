package by.ld.les04.main;
/*
 *  Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
 Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также
 ошибочные числа пользователя.
 */
import java.util.Random;
import java.util.Scanner;
public class Task31 {

	public static void main(String[] args) {
		
        int x;
        int y;
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i=0; i<10; i++) {
            x = r.nextInt((15)+1);

            System.out.println("Угадай число: ");
            y = sc.nextInt();

            if (y == x) {
                System.out.println("Угадал " + y);
            } else {
                System.out.println("Зададанное число = " + x);
                System.out.println("Твое число =  "+ y);
            }
        }

	}



	}


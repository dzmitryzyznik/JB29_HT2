package by.ld.les03.main;
/*
 *Определить, делителем каких чисел а, b, с является число k. 
 */
import java.util.Scanner;
public class Task20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a");
		int a = sc.nextInt();
		System.out.println("Введите b");
		int b = sc.nextInt();
		System.out.println("Введите c");
		int c = sc.nextInt();
		System.out.println("Введите k");
		int k = sc.nextInt();
		if (a % k ==0) { 
			System.out.println("k является делителем числа a");
			}
		if (b % k ==0) { 
			System.out.println("k является делителем числа b");
			}
		if (c % k ==0 ) {
			System.out.println("k является делителем числа c");
		}
		else if (a % k != 0 & b % k != 0 & c % k != 0){
			System.out.println("k не является делителем для введеных чисел");
		}
		

	}

}

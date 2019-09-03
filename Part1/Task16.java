package by.ld.les03.main;
/*
 * На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
 */
import java.util.Scanner;
public class Task16 {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x");
		x = sc.nextInt();
		System.out.println("Введите y");
		y = sc.nextInt();
		
		if (x== 0 & y == 0) {
			System.out.println("Точка A лежит в начале координат");
		}
		if (y == 0) {
			System.out.println("Точка A лежит на оси X");
		}
		if (x == 0) {
			System.out.println("Точка A лежит на оси Y");
		}
		if (x > 0 & y > 0) {
			System.out.println("Точка A лежит в первой четверти");
		}
			else if (x < 0 & y > 0) {
				System.out.println("Точка A лежит во второй четверти");
			}
			else if (x < 0 & y < 0) {
				System.out.println("Точка A лежит в третьей четверти");
			}
			else if (x > 0 & y < 0) {
			System.out.println("Точка A лежит в четвертой четверти");
		}
		}
	
	}



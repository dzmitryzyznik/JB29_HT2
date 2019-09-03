package by.ld.les03.main;
/*
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */
import java.util.Scanner;
public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		String str;
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		str = sc.next();
		a = str.charAt(0);
		if (a == 'Д') {
			System.out.println("Мне нравятся мальчики!");
		}
		else if (a == 'М'){
			System.out.println("Мне нравятся девочки!");
			
		}
		else {
			System.out.println("Введите заново");
		}

	}

}

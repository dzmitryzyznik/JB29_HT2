package by.ld.les04.main;
/*
 * Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
 */
public class Task34 {

	public static void main(String[] args) {
		
        System.out.println("все четырехзначные числа, сумма цифр каждого из которых равна 15");
        
        for (int i=1000; i<=9999; i++){

        	int a = i / 1000;
        	int b = (i / 100) % 10;
        	int c = (i / 10) % 10;
        	int d = i % 10;
        	int e = a + b + c + d;

            if (e==15){
                System.out.println("\n" +  + i );
            }
        }


	}

}

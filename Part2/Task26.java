package by.ld.les04.main;
/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).
 */

public class Task26 {

	public static void main(String[] args) {
	
		for (int i=0; i<=255; i++){
            System.out.println(i+" = "+(char)i);
        }
    }
	

}


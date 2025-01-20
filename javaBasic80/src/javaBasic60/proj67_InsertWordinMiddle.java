package javaBasic60;

import java.util.Scanner;

public class proj67_InsertWordinMiddle {

	public static void main(String[] args) {
        String main_string = "Python 3.0";
        String word = "Tutorial";

        String result = main_string.substring(0, 7) + word + main_string.substring(6);

        System.out.println(result);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word to insert: ");
        String w = sc.nextLine();
        sc.close();

        word = w;
        result = main_string.substring(0, 7) + word + main_string.substring(6);

        System.out.println(result);
        
	}

}

package javaBasic60;

import java.util.Scanner;

public class proj61_reverseWord {

	static String word;
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type any word: ");
        word = sc.nextLine();
        word = word.trim();
        sc.close();
        
        rever();

	}

	static void rever() {
        String r = ""; 
        
        char[] character = word.toCharArray();  
        
        for (int i = character.length - 1; i >= 0; i--) {
            r += character[i];
        }
        System.out.println("Reverse word: " + r.trim()); 

	}
	
}

package javaBasic60;

import java.util.Scanner;

public class proj37_ReverseaString {
	
	static char[] letters;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type a string: ");
        letters = sc.nextLine().toCharArray();
        
        reverse();
        
        sc.close();
        
	}

	static void reverse() {
		System.out.print("The reverse string: ");
		
        for (int l = letters.length - 1; l >= 0; l--) {
            System.out.print(letters[l]);
        }
        System.out.println();
        
	}
	
}

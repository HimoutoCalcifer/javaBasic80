package javaBasic60;

import java.util.Scanner;

public class proj28_HexadecimaltoDecimalConverter {

		
	    public static int convert_hex_to_decimal(String letter) {
	        String digits = "0123456789ABCDEF"; //string containing hexadecimal
	        letter = letter.toUpperCase(); 
	        int val = 0; 

	        // Iterate 
	        for (int i = 0; i < letter.length(); i++) {
	            char c = letter.charAt(i); 
	            int d = digits.indexOf(c);
	            val = 16 * val + d;
	        }

	        return val; 
	    }

	    
	    //The main
	    public static void main(String args[]) {
	        String hexdecimal;
	        int decimal;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Type any hexadecimal number: ");
	        hexdecimal = sc.nextLine();

	        decimal = convert_hex_to_decimal(hexdecimal);

	        System.out.print("The decimal number is: " + decimal + "\n");
	        
	        sc.close();

	}

}

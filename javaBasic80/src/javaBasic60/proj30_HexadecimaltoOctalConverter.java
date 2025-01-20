package javaBasic60;

import java.util.Scanner;

public class proj30_HexadecimaltoOctalConverter {
	
    //convert hex to oct Function 
    public static int convert_hex_to_oct(String letter) {
        String digits = "0123456789ABCDEF";
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

	public static void main(String[] args) {
		
	        String hexdecimal;
	        int decimal, i = 1, j;
	        int octal[] = new int[100];
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Type any hexadecimal number: ");
	        hexdecimal = sc.nextLine();

	        decimal = convert_hex_to_oct(hexdecimal);
	        sc.close();

	        while (decimal != 0) {
	            octal[i++] = decimal % 8;
	            decimal = decimal / 8;
	        }

	        System.out.print("The of octal number is: ");
	        for (j = i - 1; j > 0; j--) {
	            System.out.print(octal[j]);
	        }

	        System.out.print("\n");
	        
	        
	}

}

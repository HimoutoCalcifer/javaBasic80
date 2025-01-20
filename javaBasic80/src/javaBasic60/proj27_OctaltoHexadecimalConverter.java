package javaBasic60;

import java.util.Scanner;

public class proj27_OctaltoHexadecimalConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String octal, hex;
        int decimal;
        
        System.out.print("Type any octal number : ");
        octal = sc.nextLine();
        
        decimal = Integer.parseInt(octal, 8);
        
        hex = Integer.toHexString(decimal);
        
        System.out.print("The hexadecimal number: " + hex + "\n");
        
        sc.close();

	}

}

package javaBasic60;

import java.util.Scanner;

public class proj23_binarytoHexadecimalConverter {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        int[] hex = new int[1000];
        
        int i = 1;
        int	j = 0;
        int	remainder;
        int	decimal = 0;
        int	binary;


        System.out.print("Input any binary number: ");
        binary = sc.nextInt();
        sc.close();

        while (binary > 0) {
            remainder = binary % 2;
            decimal = decimal + remainder * i;
            i = i * 2;
            binary = binary / 10;
        }
        i = 0;

        while (decimal != 0) {
            hex[i] = decimal % 16;
            decimal = decimal / 16;
            i++;
        }

        System.out.print("Hexadecimal: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char)(hex[j] + 55));
            } else {
                System.out.print(hex[j]);
            }
        }
        System.out.print("\n");
        
        sc.close();
        
    }
}

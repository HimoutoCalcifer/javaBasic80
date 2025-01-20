package javaBasic60;

import java.util.Scanner;

public class proj49_CheckEvenorOdd {
	
	static int n;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        n = sc.nextInt();
        
        checker();
            
        sc.close();

        }

	static void checker() {
        if (n % 2 == 0) {
            System.out.println("The number is even"); 
        } else {
            System.out.println("The number is odd"); 
        	}
	}
	
}

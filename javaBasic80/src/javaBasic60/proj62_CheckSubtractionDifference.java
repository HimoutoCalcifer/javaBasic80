package javaBasic60;

import java.util.Scanner;

public class proj62_CheckSubtractionDifference {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type first number : ");
        int first = sc.nextInt();  
        
        System.out.print("Type second number: ");
        int second = sc.nextInt();  
        
        System.out.print("Type third number : ");
        int third = sc.nextInt(); 
        
        System.out.println((Math.abs(first - second) >= 20 || Math.abs(second - third) >= 20 || Math.abs(third - first) >= 20));

        sc.close();
        
        
	}

}

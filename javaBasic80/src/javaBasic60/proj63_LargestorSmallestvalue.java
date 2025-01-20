package javaBasic60;

import java.util.Scanner;

public class proj63_LargestorSmallestvalue {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type first number : ");
        int first = sc.nextInt();  
        
        System.out.print("Type second number: ");
        int second = sc.nextInt();  

        System.out.println("Result: " + result(first, second));
        
        sc.close();
    }

    public static int result(int i, int j) {
        if (i == j) {
            return 0;
        }
        
        if (i % 6 == j % 6) {
            return (i < j) ? i : j;
        }
        
        return (i > j) ? i : j;

	}

}

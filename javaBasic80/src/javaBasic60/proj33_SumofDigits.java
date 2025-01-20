package javaBasic60;

import java.util.Scanner;

public class proj33_SumofDigits {
	
	static long number;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type an integer: ");
        number = sc.nextLong();
        
        System.out.println("The sum of the digits: " + sumDigits(number));
        
        sc.close();
    }

    public static int sumDigits(long number) {
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
        
       

	}

}

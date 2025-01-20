package javaBasic60;

import java.util.Scanner;

public class proj57_countFactorsofInteger {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type any integer: ");
        
        int num = sc.nextInt();
        
        System.out.println(result(num));
        
        sc.close();
    }

    public static int result(int num) {
        int r = 0;
        
        for (int x = 1; x <= (int) Math.sqrt(num); x++) {
            if (num % x == 0 && x * x != num) {
                r += 2;  
            } else if (x * x == num) {
                r++; 
            }
        }
        return r;  
        
	}

}

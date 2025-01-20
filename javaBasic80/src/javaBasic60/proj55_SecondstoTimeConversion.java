package javaBasic60;

import java.util.Scanner;

public class proj55_SecondstoTimeConversion {

	static int seconds;
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type any seconds: ");
        seconds = sc.nextInt();

        converter(seconds);

        sc.close();
	}

	static int converter(int num) {
        int S = seconds % 60;  
        int H = seconds / 60;  
        int M = H % 60;         
        H = H / 60;           

        System.out.print(H + ":" + M + ":" + S);

        System.out.print("\n");
		
		return num;
	}
	
	
}

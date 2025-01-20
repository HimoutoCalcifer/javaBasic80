package javaBasic60;

import java.util.Scanner;

public class proj51_StringtoIntegerConversion {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a number (string): ");

        String thisISString = sc.nextLine();

        int thisIsnowInteger = Integer.parseInt(thisISString);

        System.out.printf("The integer value is: %d", thisIsnowInteger);
        
        sc.close();

	}

}

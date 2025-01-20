package javaBasic60;

import java.util.Scanner;

public class proj72_First3Chars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String myString;
        System.out.print("Type any word(ex. Python): ");
        myString = sc.nextLine();
        sc.close();

        int len = myString.length();

        if (len >= 3) {
            System.out.println(myString.substring(0, 3));
        } else if (len == 1) {
            System.out.println(myString.charAt(0) + "##");
        } else {
            System.out.println("###");
        }
        
	
	}

}

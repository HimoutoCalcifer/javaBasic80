package javaBasic60;

import java.util.Scanner;

public class proj73_FirstandLastCharCombo {

	public static void main(String[] args) {
        String word1 = "Python";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Type any for your second word(ex. Tutorial): ");
        String word2 = sc.nextLine();
        sc.close();

        int length2 = word2.length();

        String result = "";

        result += (word1.length() >= 1) ? word1.charAt(0) : '#';

        result += (length2 >= 1) ? word2.charAt(length2 - 1) : '#';

        System.out.println(result);

	}

}

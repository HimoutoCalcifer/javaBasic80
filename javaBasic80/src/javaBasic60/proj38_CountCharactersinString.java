package javaBasic60;

import java.util.Scanner;

public class proj38_CountCharactersinString {

    static String phrase = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

    public static void main(String[] args) {
    	
        count(phrase);
        Scanner sc = new Scanner(System.in);
        System.out.println("Try: Type your own phrase here below to count...");
        phrase = sc.nextLine().trim();
        count(phrase);
        
        sc.close();
    }

    public static void count(String x) {
        char[] ch = x.toLowerCase().toCharArray();
        int letter = 0, space = 0, num = 0, other = 0;
        for (char c : ch) {
            if (Character.isLetter(c)) letter++;
            else if (Character.isDigit(c)) num++;
            else if (Character.isSpaceChar(c)) space++;
            else other++;
        }
        System.out.println("The phrase is: " + phrase);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
        
        System.out.println();
        
    }
}

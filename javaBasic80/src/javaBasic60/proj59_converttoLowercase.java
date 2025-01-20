package javaBasic60;

import java.util.Scanner;

public class proj59_converttoLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Convert to Lowercase");
		System.out.print("Input a sentence: ");
		String phrase = sc.nextLine();
		phrase = phrase.toLowerCase();
		
		System.out.println();
		System.out.println(phrase);
		
		sc.close();
	}

}

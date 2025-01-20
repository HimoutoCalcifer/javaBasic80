package javaBasic60;

import java.util.Scanner;

public class proj58_CapitalizeEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Convert to Uppercase");
		System.out.print("Input a sentence: ");
		String phrase = sc.nextLine();
		phrase = phrase.toUpperCase();
		System.out.println();
		System.out.println(phrase);
		
		sc.close();
	}

}

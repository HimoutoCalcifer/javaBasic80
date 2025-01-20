package javaBasic60;

import java.util.Scanner;

public class proj60_findPenultimateWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String phrase;
		System.out.print("Input a sentence or a phrase here: ");
		phrase = sc.nextLine();
		String[] words = phrase.split("[ ]+");
		System.out.println( "\"" + words[words.length - 2] + "\"" + " is the Penultimate word.");
		//penultimate means second to the last.
		
		sc.close();
	}

}

package javaBasic60;

import java.util.Scanner;

public class proj44_Computen {
	
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Formula: x+xx+xxx = ans");
        System.out.print("Type a number: ");
        n = sc.nextInt();
        
        System.out.println();
        
        sum();
        
        sc.close();
	}
	
	static int number2(int num2) {
        String w2;
        w2 = Integer.toString(n);
        String word2 = w2 + w2;
        num2 = Integer.parseInt(word2);
		return num2;
	}
	
	static int number3(int num3) {
        String w3;
        w3 = Integer.toString(n);
        String word3 = w3 + w3 + w3;
        num3 = Integer.parseInt(word3);
		return num3;
	}

	static void sum() {
		System.out.print(n + "+" + n+n + "+" + n+n+n + " = ");
		System.out.println(n + number2(n) + number3(n));
	}

}

package javaBasic60;

import java.util.Scanner;

public class proj65_CustomModulus {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type first number : ");
        int first = sc.nextInt();  

        System.out.print("Type second number: ");
        int second = sc.nextInt();  

        int divided = first / second;

        int result = first - (divided * second);

        System.out.println(result);
        sc.close();

	}

}

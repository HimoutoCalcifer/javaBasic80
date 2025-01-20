package javaBasic60;

import java.util.Scanner;

public class proj35_PolygonArea {
	
	static int numberSide;
	static double side;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type the number of sides on the polygon: ");
        numberSide = sc.nextInt();
        
        System.out.print("Type the length of one side: ");
        side = sc.nextDouble();
        
        System.out.print("The area: " + polygonArea(numberSide, side) + "\n");
        
        sc.close();
        
    }

    public static double polygonArea(int numberSide, double side) {
        return (numberSide * (side * side)) / (4.0 * Math.tan(Math.PI / numberSide));
        
       
    }
}

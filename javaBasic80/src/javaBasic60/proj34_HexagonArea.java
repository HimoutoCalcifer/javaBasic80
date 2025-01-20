package javaBasic60;

import java.util.Scanner;

public class proj34_HexagonArea {
	
	static double side;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type your length of hexagon: ");
        double side = sc.nextDouble();
        
        System.out.print("Yor area of hexagon: " + hexagonArea(side) + "\n");
        
        sc.close();
        
    }

    public static double hexagonArea(double side) {
        return (6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
	}

}

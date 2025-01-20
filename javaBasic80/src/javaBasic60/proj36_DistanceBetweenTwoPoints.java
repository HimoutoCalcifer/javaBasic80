package javaBasic60;

import java.util.Scanner;

public class proj36_DistanceBetweenTwoPoints {

	static double latitude1, longitude1, latitude2, longitude2;
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Type latitude of coordinate 1: ");
        latitude1 = sc.nextDouble();
        System.out.print("Type longitude of coordinate 1: ");
        longitude1 = sc.nextDouble();
        
        System.out.print("Type latitude of coordinate 2: ");
        latitude2 = sc.nextDouble();
        System.out.print("Type longitude of coordinate 2: ");
        longitude2 = sc.nextDouble();

        System.out.print("Distance between those points: " + distanceBetweenLatitudeLong(latitude1, longitude1, latitude2, longitude2) + " km\n");

        sc.close();
        
    }

    public static double distanceBetweenLatitudeLong(double latitude1, double longitude1, double latitude2, double longitude2) {
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        double earth_radius = 6371.01;

        return earth_radius * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));


	}

}

package javaBasic60;

public class proj11_circleAreaandPerimeter {

	public static void main(String[] args) {
		
		double pi = 3.14159265358979323846264338327950288419716939937510;
		double rad = 7.5;
		double perimeter = 2 * pi * rad;
		double area = Math.PI * (rad * rad);//use built in Math.PI
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);

	}

}

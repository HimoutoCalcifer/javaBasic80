package javaBasic60;

public class proj15_swapVariables {

	public static void main(String[] args) {

		int x, y;
		x = 15;
		y = 27;

		
		System.out.println("Before swapping: " + x + " , " + y);
		int temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping: " + x + " , " + y);
		
		
		
	}

}

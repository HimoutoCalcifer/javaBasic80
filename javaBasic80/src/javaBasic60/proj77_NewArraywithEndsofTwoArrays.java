package javaBasic60;

import java.util.Arrays;

public class proj77_NewArraywithEndsofTwoArrays {

	public static void main(String[] args) {
        int[] myArray1 = {50, -20, 0};
        int[] myArray2 = {5, -50, 10};
        
        System.out.println("Array1: " + Arrays.toString(myArray1));
        
        System.out.println("Array2: " + Arrays.toString(myArray2));
        
        int[] array_new = {myArray1[0], myArray2[2]};	
        
        System.out.println("New Array: " + Arrays.toString(array_new));

	}

}

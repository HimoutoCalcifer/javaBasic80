package javaBasic60;

public class proj76_FirstandLastofTwoArrays {

	public static void main(String[] args) {
        
		
        int[] number_array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] number_array2 = {45, 20, 10, 20, 30, 50, 11};
        
        if (number_array1.length >= 2 && number_array2.length >= 2) {
        	System.out.println(number_array1[0] == number_array2[0] || number_array1[number_array1.length - 1] == number_array2[number_array2.length - 1]);
        } else {
        	System.out.println("Array lengths less than 2.");
        }
	}

}

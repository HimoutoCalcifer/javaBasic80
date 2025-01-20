package javaBasic60;

import java.util.Arrays;

public class proj79_RotateArrayLeft {

	public static void main(String[] args) {
        int[] myArrayNumber = {20, 30, 40};
        
        System.out.println("Original Array: " + Arrays.toString(myArrayNumber)); 
        
        int[] new_array_nums = {myArrayNumber[1], myArrayNumber[2], myArrayNumber[0]};
        
        System.out.println("Rotated Array Result: " + Arrays.toString(new_array_nums)); 

	}

}

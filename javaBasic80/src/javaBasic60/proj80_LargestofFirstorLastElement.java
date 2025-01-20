package javaBasic60;

import java.util.Arrays;

public class proj80_LargestofFirstorLastElement {

	public static void main(String[] args) {
        int[] myArrayNumbers = {20, 30, 40};
        
        System.out.println("The Original Array: " + Arrays.toString(myArrayNumbers)); 
        
        int max_val = myArrayNumbers[0];
        
        if (myArrayNumbers[2] >= max_val)
            max_val = myArrayNumbers[2];
        
        System.out.println("Larger value between first and last element: " + max_val); 
	}

}

package javaBasic60;

import java.util.Arrays;

public class proj78_Contains4or7 {

	public static void main(String[] args) {
        int[] myNumberArray = {5, 7};
        
        System.out.println("Original Array: " + Arrays.toString(myNumberArray)); 
        
        if (myNumberArray[0] == 4 || myNumberArray[0] == 7) {
            System.out.println("True");
        } else {
            System.out.println(myNumberArray[1] == 4 || myNumberArray[1] == 7);
        }
	}

}

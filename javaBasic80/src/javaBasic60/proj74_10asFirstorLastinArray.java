package javaBasic60;

public class proj74_10asFirstorLastinArray {

	public static void main(String[] args) {
        int[] number_array = {10, -20, 0, 30, 40, 60, 10};
        
        boolean result = (number_array[0] == 10 || number_array[number_array.length - 1] == 10);

        System.out.println(result);
	}

}

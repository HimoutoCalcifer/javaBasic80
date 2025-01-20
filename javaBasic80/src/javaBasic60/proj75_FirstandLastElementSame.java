package javaBasic60;

public class proj75_FirstandLastElementSame {

	public static void main(String[] args) {
        int[] number_array = {50, -20, 0, 30, 40, 60, 10};
        
        boolean result = (number_array.length >= 2 && number_array[0] == number_array[number_array.length - 1]);

        System.out.println(result);
	}

}

package javaBasic60;

import java.nio.charset.Charset;

public class proj40_ListAvailableCharsets {

	public static void main(String[] args) {
        System.out.println("The list of available character sets: ");
        
        for (String char_list : Charset.availableCharsets().keySet()) {
            System.out.println(char_list);
        }
	}

}

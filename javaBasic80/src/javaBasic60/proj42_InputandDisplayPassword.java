package javaBasic60;

import java.io.Console;

public class proj42_InputandDisplayPassword {

	public static void main(String[] args) {
        Console cons;
        if ((cons = System.console()) != null) {
            char[] password = null;

            try {
                password = cons.readPassword("Type your Password: ");

                System.out.println("Your password was: " + new String(password));
            } finally {
                if (password != null) {
                    java.util.Arrays.fill(password, ' ');
                }
            }
        } else {
            throw new RuntimeException("No console");
        }
	
        
	}

}

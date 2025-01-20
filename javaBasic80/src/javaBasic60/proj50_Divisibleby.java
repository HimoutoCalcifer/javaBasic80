package javaBasic60;

public class proj50_Divisibleby {

	public static void main(String[] args) {
		
		int x;
		
        System.out.println("Divided by 3: ");
        for ( x = 1; x < 100; x++) {
            if (x % 3 == 0)
                System.out.print(x + ", ");
        }

        System.out.println("\nDivided by 5: ");
        for ( x = 1; x < 100; x++) {
            if (x % 5 == 0)
                System.out.print(x + ", ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for ( x = 1; x < 100; x++) {
            if (x % 3 == 0 && x % 5 == 0)
                System.out.print(x + ", ");
        }
        
	}

}

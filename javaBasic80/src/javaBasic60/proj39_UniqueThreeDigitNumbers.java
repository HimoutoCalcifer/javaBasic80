package javaBasic60;

public class proj39_UniqueThreeDigitNumbers {

	static int total = 0; 
	
	public static void main(String[] args) {
	        
		displayNum();
		

	}

	static void displayNum() {
        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 4; y++) {
                for (int z = 1; z <= 4; z++) {
                    if (z != x && z != y && x != y) {
                        total++; 
                        System.out.println(x + "" + y + "" + z); 
                    }
                }
            }
        }
        
        System.out.println("The total of three digits:  " + total);
	}
	
}

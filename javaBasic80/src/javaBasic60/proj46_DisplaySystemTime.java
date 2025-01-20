package javaBasic60;

public class proj46_DisplaySystemTime {

	public static void main(String[] args) {
		
		datetime();
		System.out.println();

	}

	static void datetime() {
		System.out.format("This current Date time: %tc%n\n", System.currentTimeMillis());
	}
	
}

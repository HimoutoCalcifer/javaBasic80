package javaBasic60;

public class proj68_RepeatLast3Characters {

	public static void main(String[] args) {
        String main_string = "Python 3.0";

        String last_three_chars = main_string.substring(main_string.length() - 3);

        System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);

	}

}

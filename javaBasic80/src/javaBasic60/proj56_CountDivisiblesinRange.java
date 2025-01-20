package javaBasic60;

public class proj56_CountDivisiblesinRange {

	public static void main(String[] args) {
		
        int x = 5;
        int y = 20;
        int p = 3;

        System.out.println(result(x, y, p));
    }

    public static int result(int a, int b, int c) {
        if (a % c == 0) {
            return (b / c - a / c + 1);
        } else {
            return (b / c - a / c);

        }
    }

}

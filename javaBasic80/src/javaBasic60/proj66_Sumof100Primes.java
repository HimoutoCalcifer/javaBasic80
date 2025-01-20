package javaBasic60;

public class proj66_Sumof100Primes {

	public static void main(String[] args) {
        int sum = 1, counter = 0, number = 0;

        while (counter < 100) {
            number++;

            if (number % 2 != 0) {
                if (prime(number)) {
                    sum += number;
                }
            }

            counter++;
        }

        System.out.println("The sum of the prime numbers till 100: " + sum);
    }

    public static boolean prime(int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}

}

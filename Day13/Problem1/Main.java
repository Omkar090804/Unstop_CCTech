import java.util.Scanner;

public class Main {

    // Function to find smallest prime factor
    public static int smallestPrimeFactor(int n) {

        // If number is even
        if (n % 2 == 0) {
            return 2;
        }

        // Check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return i;
            }
        }

        // If no factor found, n itself is prime
        return n;
    }

    public static int user_logic(int n) {

        int count = 0;

        while (n > 0) {

            int spf = smallestPrimeFactor(n);

            n -= spf;

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = user_logic(n);

        System.out.println(result);

        scanner.close();
    }
}
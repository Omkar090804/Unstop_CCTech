import java.util.*;

public class Main {

    // Function to calculate GCD
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long computeX(long p, long n) {

        // LCM formula
        long lcm = (p / gcd(p, n)) * n;

        return lcm;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long p = scanner.nextLong();
        long n = scanner.nextLong();

        // Call user logic function
        long result = computeX(p, n);

        System.out.println(result);
    }
}
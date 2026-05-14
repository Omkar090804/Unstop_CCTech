import java.util.Scanner;

public class Main {

    // Function to check prime number
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void modifyString(int n, String s) {

        int sum = 0;
        int count = 0;

        // Find all prime digits and calculate average
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (isPrime(digit)) {
                    sum += digit;
                    count++;
                }
            }
        }

        // Floor average of prime digits
        int avg = 0;

        if (count > 0) {
            avg = sum / count;
        }

        StringBuilder result = new StringBuilder();

        // Modify string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int digit = ch - '0';
                int index;

                // If no prime numbers exist
                if (count == 0) {
                    index = digit;
                } else {
                    index = digit % avg;
                }

                // Convert index to alphabet
                char newChar = (char) ('a' + index);

                result.append(newChar);

            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        modifyString(n, s);
    }
}
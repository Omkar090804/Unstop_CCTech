import java.util.Scanner;

public class Main {

    // Function to count total number of 1's in binary representation
    // of all numbers from 1 to N
    public static int countOnesInBinary(int N) {
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;

            // Count set bits (1's) in current number
            while (num > 0) {
                count += (num & 1); // Check last bit
                num >>= 1;          // Right shift
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int result = countOnesInBinary(N);

        System.out.println(result);

        scanner.close();
    }
}
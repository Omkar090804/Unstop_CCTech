import java.util.*;

public class Main {

    public static int calculateGoldenValue(int[] arr, int n) {

        int evenSum = 0;
        int oddSum = 0;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {

            int xor = 0;

            for (int j = i; j < n; j++) {

                xor ^= arr[j];

                int length = j - i + 1;

                // Check subarray length
                if (length % 2 == 0) {
                    evenSum += xor;
                } else {
                    oddSum += xor;
                }
            }
        }

        // Golden value
        return Math.abs(evenSum - oddSum);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int result = calculateGoldenValue(arr, n);

        System.out.println(result);
    }
}
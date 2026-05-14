import java.util.*;

public class Main {

    static int index = 0;

    public static void userLogic(int n, int[] arr, int[] result) {

        int minValue = arr[0];
        int maxDiff = -1;

        for (int i = 1; i < n; i++) {

            // Calculate difference
            int diff = arr[i] - minValue;

            // Update maximum difference
            if (diff > maxDiff) {
                maxDiff = diff;
            }

            // Update minimum value seen so far
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        // If no positive difference exists
        if (maxDiff <= 0) {
            result[index++] = -1;
        } else {
            result[index++] = maxDiff;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] results = new int[T];

        for (int t = 0; t < T; t++) {

            int N = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            userLogic(N, arr, results);
        }

        // Print all results
        for (int result : results) {
            System.out.println(result);
        }
    }
}
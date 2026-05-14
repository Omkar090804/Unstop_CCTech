import java.util.*;

public class Main {

    // Function to check if a number has exactly one bit set
    public static boolean hasOneBitSet(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static int count_good_indices(int n, int[] arr) {

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += arr[i];

            // Check if prefix sum has exactly one bit set
            if (hasOneBitSet(prefixSum)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = count_good_indices(n, arr);

        System.out.println(result);
    }
}
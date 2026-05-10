import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(peakIndexInMountainArray(arr));
    }

    // Function to find first peak index
    public static int peakIndexInMountainArray(int[] A) {

        for (int i = 1; i < A.length - 1; i++) {

            // Check if current element is greater than or equal
            // to both adjacent elements
            if (A[i] >= A[i - 1] && A[i] >= A[i + 1]) {
                return i;
            }
        }

        return -1; // If no peak found
    }
}
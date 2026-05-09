import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int maxSize = 0;

        for (int right = 0; right < n; right++) {

            // Remove submissions older than 5000 seconds
            while (arr[right] - arr[left] >= 5000) {
                left++;
            }

            // Current queue size
            int currentSize = right - left + 1;

            maxSize = Math.max(maxSize, currentSize);
        }

        System.out.println(maxSize);
    }
}
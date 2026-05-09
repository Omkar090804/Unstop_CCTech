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

        // Sort the array
        Arrays.sort(arr);

        int maxSum = 0;

        // Add elements at even indexes
        for (int i = 0; i < n; i += 2) {
            maxSum += arr[i];
        }

        System.out.println(maxSum);
    }
}
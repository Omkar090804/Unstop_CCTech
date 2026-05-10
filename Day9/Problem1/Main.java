import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int totalSum = 0;

        // Input array and calculate total sum
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        // Sort array in descending order
        Arrays.sort(arr);

        List<Integer> result = new ArrayList<>();

        int currentSum = 0;

        // Pick largest elements until majority is formed
        for (int i = n - 1; i >= 0; i--) {

            currentSum += arr[i];
            result.add(arr[i]);

            // Check majority condition
            if (currentSum > totalSum - currentSum) {
                break;
            }
        }

        // Print result in non-increasing order
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
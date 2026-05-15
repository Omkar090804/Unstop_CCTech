import java.util.*;

public class Main {

    // Function to check if any prefix sum becomes zero
    public static boolean isValid(int[] arr) {

        int sum = 0;

        for (int num : arr) {

            sum += num;

            if (sum == 0) {
                return false;
            }
        }

        return true;
    }

    public static String[] userLogic(int n, int[] arr) {

        // Ascending order
        int[] asc = arr.clone();
        Arrays.sort(asc);

        // Descending order
        int[] desc = arr.clone();
        Arrays.sort(desc);

        for (int i = 0; i < n / 2; i++) {
            int temp = desc[i];
            desc[i] = desc[n - 1 - i];
            desc[n - 1 - i] = temp;
        }

        boolean ascValid = isValid(asc);
        boolean descValid = isValid(desc);

        if (!ascValid && !descValid) {
            return new String[]{"IMPOSSIBLE"};
        }

        int[] result;

        // If both valid, choose one with larger first element
        if (ascValid && descValid) {

            if (desc[0] > asc[0]) {
                result = desc;
            } else {
                result = asc;
            }

        } else if (ascValid) {
            result = asc;
        } else {
            result = desc;
        }

        String[] output = new String[n + 1];

        output[0] = "POSSIBLE";

        for (int i = 0; i < n; i++) {
            output[i + 1] = String.valueOf(result[i]);
        }

        return output;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        String[] result = userLogic(n, arr);

        if (result[0].equals("IMPOSSIBLE")) {

            System.out.println("IMPOSSIBLE");

        } else {

            System.out.println("POSSIBLE");

            for (int i = 1; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }

            System.out.println();
        }
    }
}
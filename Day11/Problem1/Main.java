import java.util.*;

public class Main {

    public static int userLogic(int n, int[] arr) {

        int count = 0;

        // Check all pairs
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int xor = arr[i] ^ arr[j];
                int and = arr[i] & arr[j];

                // Condition check
                if (xor <= and) {
                    count++;
                }
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

        int result = userLogic(n, arr);

        System.out.println(result);
    }
}
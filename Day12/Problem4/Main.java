import java.util.*;

public class Main {

    // Function to check if K problems can be solved in given time
    public static boolean canSolve(int[] times, int n, int k, long mid) {

        long totalProblems = 0;

        for (int i = 0; i < n; i++) {

            totalProblems += mid / times[i];

            // No need to continue if already enough
            if (totalProblems >= k) {
                return true;
            }
        }

        return false;
    }

    public static int minimumTimeToSolveProblems(int n, int k, int[] times) {

        if (n == 0 || k <= 0) {
            return -1;
        }

        long low = 1;
        long high = (long) Arrays.stream(times).min().getAsInt() * k;

        long answer = -1;

        // Binary Search
        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canSolve(times, n, k, mid)) {
                answer = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return (int) answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextInt();
        }

        int result = minimumTimeToSolveProblems(n, k, times);

        System.out.println(result);
    }
}
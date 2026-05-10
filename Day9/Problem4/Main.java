import java.util.*;

public class Main {

    public static int minCost(int[] v) {

        int n = v.length;

        // dp[i] = minimum cost to reach index i
        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            // Jump from i-1
            dp[i] = Math.min(dp[i],
                    dp[i - 1] + Math.abs(v[i] - v[i - 1]));

            // Jump from i-2
            if (i > 1) {
                dp[i] = Math.min(dp[i],
                        dp[i - 2] + Math.abs(v[i] - v[i - 2]));
            }

            // Jump from i-3
            if (i > 2) {
                dp[i] = Math.min(dp[i],
                        dp[i - 3] + Math.abs(v[i] - v[i - 3]));
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        int result = minCost(v);

        System.out.println(result);
    }
}
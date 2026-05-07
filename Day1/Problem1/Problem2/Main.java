import java.util.*;

public class Main {
    public static void find_youngest_member(int n, int m, int[][] gifts) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        // Process all gifts
        for (int i = 0; i < m; i++) {
            int giver = gifts[i][0];
            int receiver = gifts[i][1];

            outDegree[giver]++;
            inDegree[receiver]++;
        }

        // Find the youngest member
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                System.out.println(i);
                return;
            }
        }

        // If no such member found
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gifts = new int[m][2];
        for (int i = 0; i < m; i++) {
            gifts[i][0] = scanner.nextInt();
            gifts[i][1] = scanner.nextInt();
        }
        find_youngest_member(n, m, gifts);
    }
}
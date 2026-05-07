import java.util.Scanner;

public class Main {

    public static long compareBits(String a, String b) {

        int n = a.length();
        int m = b.length();

        long total = 0;

        // Prefix count of '1's in b
        int[] prefixOnes = new int[m + 1];

        for (int i = 0; i < m; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (b.charAt(i) == '1' ? 1 : 0);
        }

        // Compare each position
        for (int i = 0; i < n; i++) {

            // In b, this position can align from i to i + (m-n)
            int left = i;
            int right = i + (m - n);

            int ones = prefixOnes[right + 1] - prefixOnes[left];
            int totalPositions = right - left + 1;
            int zeros = totalPositions - ones;

            if (a.charAt(i) == '0') {
                total += ones;
            } else {
                total += zeros;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        System.out.println(compareBits(a, b));
    }
}
import java.util.Scanner;

public class Main {

    // Function to expand around center
    public static int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static int longestPalindromicSubstringLength(int n, String s) {

        int maxLength = 1;

        for (int i = 0; i < n; i++) {

            // Odd length palindrome
            int len1 = expand(s, i, i);

            // Even length palindrome
            int len2 = expand(s, i, i + 1);

            int currentMax = Math.max(len1, len2);

            maxLength = Math.max(maxLength, currentMax);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int result = longestPalindromicSubstringLength(n, s);

        System.out.println(result);
    }
}
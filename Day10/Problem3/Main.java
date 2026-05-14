import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static boolean check_if_can_break(String s1, String s2) {
        
        // If lengths are different, return false
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        boolean s1Breaks = true;
        boolean s2Breaks = true;

        // Compare characters
        for (int i = 0; i < a.length; i++) {

            if (a[i] < b[i]) {
                s1Breaks = false;
            }

            if (b[i] < a[i]) {
                s2Breaks = false;
            }
        }

        // If either condition is true
        return s1Breaks || s2Breaks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        // Call user logic function and print the output
        boolean result = check_if_can_break(s1, s2);

        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
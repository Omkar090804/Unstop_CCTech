import java.util.Scanner;

public class Main {
    public static int userLogic(int n, String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } 
            else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int result = userLogic(n, s);
        System.out.println(result);
    }
}
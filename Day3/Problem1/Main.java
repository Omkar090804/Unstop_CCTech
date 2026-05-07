import java.util.Scanner;
import java.util.Stack;

public class Main {

    // User logic function
    public static int userLogic(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {

            if (op.equals("+")) {

                int top = stack.pop();
                int newScore = top + stack.peek();

                stack.push(top);
                stack.push(newScore);

            } 
            else if (op.equals("D")) {

                stack.push(2 * stack.peek());

            } 
            else if (op.equals("C")) {

                stack.pop();

            } 
            else {

                stack.push(Integer.parseInt(op));
            }
        }

        // Calculate total sum
        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] ops = new String[n];

        for (int i = 0; i < n; ++i) {
            ops[i] = scanner.next();
        }

        int result = userLogic(ops);

        System.out.println(result);
    }
}
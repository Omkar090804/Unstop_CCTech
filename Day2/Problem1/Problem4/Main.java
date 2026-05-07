import java.util.*;

public class Main {

    public static int goodSum(int N, int[] A) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {

            // If current element is positive
            if (A[i] >= 0) {
                stack.push(A[i]);
            } 
            else {
                int need = Math.abs(A[i]);
                int removedSum = 0;

                // Remove minimum previous elements
                while (!stack.isEmpty() && removedSum < need) {
                    removedSum += stack.pop();
                }

                // Convert negative to positive and add
                stack.push(need);
            }
        }

        // Calculate final sum
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int result = goodSum(N, A);
        System.out.println(result);
    }
}
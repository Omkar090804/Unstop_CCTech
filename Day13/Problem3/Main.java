import java.util.*;

class Main {

    public static int diagonalSum(int[][] matrix, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Main diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            sum += matrix[i][n - 1 - i];
        }

        // If n is odd, remove the center element once
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int result = diagonalSum(matrix, n);

        System.out.println(result);
    }
}
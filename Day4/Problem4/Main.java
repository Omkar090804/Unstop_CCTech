import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long value = 1;

        // Print nth row of Pascal's Triangle
        for (int i = 0; i <= n; i++) {

            System.out.print(value);

            if (i != n) {
                System.out.print(" ");
            }

            // Compute next value using nCr formula
            value = value * (n - i) / (i + 1);
        }
    }
}
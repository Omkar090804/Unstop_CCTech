import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int K = sc.nextInt();

        // Sort based on distance from origin
        Arrays.sort(points, (a, b) -> {
            int distA = a[0] * a[0] + a[1] * a[1];
            int distB = b[0] * b[0] + b[1] * b[1];

            return distA - distB;
        });

        // Print first K points
        for (int i = 0; i < K; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
    }
}
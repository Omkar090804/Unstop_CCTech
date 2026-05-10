import java.util.Scanner;

public class Main {

    public static int calculateFScore(int[] features, int N) {

        // XOR of XORs of all subsets
        // If N == 1, answer is the element itself
        // Otherwise answer is 0

        if (N == 1) {
            return features[0];
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] features = new int[N];

        for (int i = 0; i < N; i++) {
            features[i] = sc.nextInt();
        }

        int result = calculateFScore(features, N);

        System.out.println(result);

        sc.close();
    }
}
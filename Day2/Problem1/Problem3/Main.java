import java.util.Scanner;

public class Main {
    public static int highestAltitude(int n, int[] arr) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < n; i++) {
            altitude += arr[i];
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = highestAltitude(n, arr);
        System.out.println(result);
    }
}
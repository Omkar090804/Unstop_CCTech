import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < q; i++) {

            int A = sc.nextInt(); // frequency
            int B = sc.nextInt(); // number

            // For minimum frequency
            if (A < minFreq) {
                minFreq = A;
                minNumber = B;
            } else if (A == minFreq) {
                minNumber = Math.min(minNumber, B);
            }

            // For maximum frequency
            if (A > maxFreq) {
                maxFreq = A;
                maxNumber = B;
            } else if (A == maxFreq) {
                maxNumber = Math.max(maxNumber, B);
            }
        }

        // If all frequencies are same
        if (minFreq == maxFreq) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(maxNumber - minNumber));
        }

        sc.close();
    }
}
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        // Sort the array
        Arrays.sort(A);

        List<Integer> indices = new ArrayList<>();

        // Find indices where value equals K
        for (int i = 0; i < N; i++) {
            if (A[i] == K) {
                indices.add(i);
            }
        }

        // Print count
        System.out.println(indices.size());

        // Print indices
        for (int index : indices) {
            System.out.print(index + " ");
        }

        sc.close();
    }
}
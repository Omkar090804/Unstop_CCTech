import java.util.*;

public class Main {
    static class Pair {
        int l, r;
        Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    public static int calculatePairs(int n, int[] arr) {
        int[] prefix = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        // Map: sum -> list of subarrays
        HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();

        // Generate all subarrays
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int sum = prefix[j] - prefix[i - 1];
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(new Pair(i, j));
            }
        }

        int count = 0;

        // For each sum group
        for (ArrayList<Pair> list : map.values()) {
            int size = list.size();
            if (size < 2) continue;

            // Sort by ending index
            list.sort((a, b) -> a.r - b.r);

            // Count non-overlapping pairs
            for (int i = 0; i < size; i++) {
                Pair p1 = list.get(i);
                for (int j = i + 1; j < size; j++) {
                    Pair p2 = list.get(j);
                    if (p1.r < p2.l) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = calculatePairs(n, arr);
        System.out.println(result);
    }
}
import java.util.*;

public class Main {

    public static int calculateTotalCost(int k, int n, int m, List<int[]> graph) {

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build undirected graph
        for (int[] edge : graph) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // BFS traversal from node 0
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);
        visited[0] = true;

        int nonFunctionalBulbs = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            // Count bulbs divisible by m except 0
            if (current != 0 && current % m == 0) {
                nonFunctionalBulbs++;
            }

            for (int neighbor : adj.get(current)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        // Total cost
        return nonFunctionalBulbs * k;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();      // Price of one bulb
        int n = scanner.nextInt();      // Total bulbs
        int m = scanner.nextInt();      // Divisible number
        int lenGraph = scanner.nextInt();

        List<int[]> graph = new ArrayList<>();

        for (int i = 0; i < lenGraph; i++) {

            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.add(new int[]{u, v});
        }

        // Call user logic function
        int totalCost = calculateTotalCost(k, n, m, graph);

        System.out.println(totalCost);
    }
}
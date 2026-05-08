import java.util.*;

public class Main {

    public static void processQueries(int q, List<String[]> queries) {

        HashMap<String, Integer> chocolates = new HashMap<>();

        for (String[] query : queries) {

            int type = Integer.parseInt(query[0]);
            String name = query[1];
            int quantity = Integer.parseInt(query[2]);

            // Type 1 -> Add chocolates
            if (type == 1) {

                chocolates.put(name,
                        chocolates.getOrDefault(name, 0) + quantity);

            }
            // Type 2 -> Sell chocolates
            else if (type == 2) {

                int available = chocolates.getOrDefault(name, 0);

                int sold = Math.min(available, quantity);

                System.out.println(sold);

                chocolates.put(name, available - sold);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.nextLine();

        List<String[]> queries = new ArrayList<>();

        for (int i = 0; i < q; ++i) {

            String[] parts = scanner.nextLine().split(" ");

            queries.add(parts);
        }

        processQueries(q, queries);

        scanner.close();
    }
}
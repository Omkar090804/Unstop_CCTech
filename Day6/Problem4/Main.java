import java.util.*;

public class Main {

    public static int maxBottleCost(int n, int x, int[] costs) {

        Arrays.sort(costs);

        int totalBottles = 0;
        int day = 0;

        while (true) {

            int spent = 0;
            int bottlesToday = 0;

            for (int i = 0; i < n; i++) {

                int currentPrice = costs[i] + day;

                if (spent + currentPrice <= x) {
                    spent += currentPrice;
                    bottlesToday++;
                } else {
                    break;
                }
            }

            // Cannot buy any bottle
            if (bottlesToday == 0) {
                break;
            }

            totalBottles += bottlesToday;
            day++;
        }

        return totalBottles;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }

        int result = maxBottleCost(n, x, costs);

        System.out.println(result);
    }
}
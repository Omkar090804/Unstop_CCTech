import java.util.*;

public class Main {

    public static List<Integer> modifyArray(int n, List<Integer> arr) {

        int maxSoFar = arr.get(0);

        for (int i = 0; i < n; i++) {

            // update maximum till current index
            maxSoFar = Math.max(maxSoFar, arr.get(i));

            // add maximum to current element
            arr.set(i, arr.get(i) + maxSoFar);
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> modifiedArr = modifyArray(n, arr);

        for (int num : modifiedArr) {
            System.out.print(num + " ");
        }
    }
}
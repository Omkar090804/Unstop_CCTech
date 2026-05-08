import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int repeated = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == size / 2) {
                repeated = entry.getKey();
                break;
            }
        }

        System.out.print(repeated);

        sc.close();
    }
}
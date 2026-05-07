import java.io.*;
import java.util.*;

public class Main {

    public static int countConsistentCars(String components, int n, List<String> models) {

        HashSet<Character> allowed = new HashSet<>();

        // Store allowed components
        for (char ch : components.toCharArray()) {
            allowed.add(ch);
        }

        int count = 0;

        // Check each model
        for (String model : models) {

            boolean valid = true;

            for (char ch : model.toCharArray()) {
                if (!allowed.contains(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String components = reader.readLine().trim();

        int n = Integer.parseInt(reader.readLine().trim());

        List<String> models = new ArrayList<>();

        // Read all models
        String[] input = reader.readLine().trim().split(" ");

        for (int i = 0; i < n; i++) {
            models.add(input[i]);
        }

        int result = countConsistentCars(components, n, models);

        System.out.println(result);
    }
}
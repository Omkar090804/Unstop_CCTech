import java.util.Scanner;

public class Main {

    public static String transformString(String s, char ch) {

        // Find last occurrence of ch
        int index = s.lastIndexOf(ch);

        // If character not found, return original string
        if (index == -1) {
            return s;
        }

        // Split string into two parts
        String firstPart = s.substring(0, index);
        String secondPart = s.substring(index);

        // Reverse second part
        String reversed = new StringBuilder(secondPart).reverse().toString();

        // Return transformed string
        return firstPart + reversed;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] data = input.split(" ");

        String s = data[0];

        char ch = data[1].charAt(0);

        String result = transformString(s, ch);

        System.out.println(result);
    }
}
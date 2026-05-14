import java.util.HashSet;
import java.util.Scanner;

class Main {

    // Function to count unique characters
    public static int countUnique(String str) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        return set.size();
    }

    public static void determine_winner(int N, String smit_str, String joy_str) {

        int smitUnique = countUnique(smit_str);
        int joyUnique = countUnique(joy_str);

        // Since both strings have same length,
        // compare only number of unique characters

        if (smitUnique > joyUnique) {
            System.out.println("SMIT");
        } 
        else if (joyUnique > smitUnique) {
            System.out.println("JOY");
        } 
        else {
            System.out.println("TIE");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String smit_str = scanner.nextLine();
        String joy_str = scanner.nextLine();

        determine_winner(N, smit_str, joy_str);
    }
}
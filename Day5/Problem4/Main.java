import java.util.*;

class Main {

    public static String process(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '#') {

                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }

            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean userLogic(String bob, String alice) {

        String finalBob = process(bob);
        String finalAlice = process(alice);

        return finalBob.equals(finalAlice);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bob = sc.nextLine();
        String alice = sc.nextLine();

        boolean result = userLogic(bob, alice);

        System.out.println(result ? "YES" : "NO");

        sc.close();
    }
}
package Problem2;

public import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();

            boolean possible = true;

            int r = 0, b = 0;

            for (int i = 0; i < N; i++) {
                char ch = s.charAt(i);

                if (ch == 'R') {
                    r++;
                } else if (ch == 'B') {
                    b++;
                } else { // W found
                    if ((r > 0 || b > 0) && (r == 0 || b == 0)) {
                        possible = false;
                        break;
                    }
                    r = 0;
                    b = 0;
                }
            }

            // Check last segment
            if ((r > 0 || b > 0) && (r == 0 || b == 0)) {
                possible = false;
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
} {
    
}

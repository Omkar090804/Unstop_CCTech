import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String str = sc.next();

        // kth character in reversed string
        char ans = str.charAt(n - k);

        System.out.println(ans);
    }
}
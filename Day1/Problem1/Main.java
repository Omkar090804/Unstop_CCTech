import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  

        int col = s.charAt(0) - 'a' + 1; 
        int row = s.charAt(1) - '0';     

        if ((col + row) % 2 == 0)
            System.out.println("Black");
        else
            System.out.println("White");
    }
}
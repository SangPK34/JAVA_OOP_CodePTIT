package J03008_So_dep_3;

import java.util.*;

public class Main {

    static String check(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            char y = s.charAt(n - i - 1);
            if (s.matches(".*[^2357].*")) {
                return ("NO");
            }
            if (x != y) {
                return ("NO");
            }

        }

        return ("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}

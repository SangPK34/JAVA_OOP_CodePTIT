package J03025_Xau_doi_xung;

import java.util.*;

public class Main {

    static String check(String s) {
        int n = s.length();
        if (n < 2) {
            return "YES";
        }
        int khac = 0;
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                khac++;
                if (khac > 1) {
                    return "NO";
                }
            }

        }
        if (khac == 1) {
            return "YES";
        } else if (n % 2 == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}

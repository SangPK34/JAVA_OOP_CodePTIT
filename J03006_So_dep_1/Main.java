package J03006_So_dep_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        run:
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) - '0') % 2 != 0) {
                    System.out.println("NO");
                    continue run;
                }
                res.append(s.charAt(s.length() - i - 1));
            }
            String rev = res.toString();
            if (rev.equals(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

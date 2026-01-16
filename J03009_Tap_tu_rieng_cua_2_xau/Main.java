package J03009_Tap_tu_rieng_cua_2_xau;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            Set<String> A = new TreeSet<>();
            Set<String> B = new TreeSet<>();
            String s1 = sc.nextLine();
            if (s1.isEmpty()) {
                s1 = sc.nextLine();
            }
            String s2 = sc.nextLine();
            if (s2.isEmpty()) {
                s2 = sc.nextLine();
            }
            for (String w : s1.trim().split("\\s+")) {
                A.add(w);
            }
            for (String w : s2.trim().split("\\s+")) {
                B.add(w);
            }
            A.removeAll(B);
            for (String x : A) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

package J01010_Cat_doi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            if (!s.matches("[0189]+")) {
                System.out.println("INVALID");
                continue;
            }

            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c == '1') sb.append('1');
                else sb.append('0');
            }

            String res = sb.toString().replaceFirst("^0+", "");

            if (res.isEmpty()) {
                System.out.println("INVALID");
            } else {
                System.out.println(res);
            }
        }
    }
}

package J03004_Chuan_hoa_xau_ho_ten_1;

import java.util.*;

public class Main {

    public static String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] w = s.split("\\s+");

        StringBuilder res = new StringBuilder();

        for (String x : w) {
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(chuanhoa(s));
        }
    }
}

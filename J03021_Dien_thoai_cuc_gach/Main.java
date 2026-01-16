package J03021_Dien_thoai_cuc_gach;

import java.util.*;

public class Main {
    
    static char key(char c){
        c = Character.toLowerCase(c);

        if ("abc".indexOf(c) >= 0) return '2';
        if ("def".indexOf(c) >= 0) return '3';
        if ("ghi".indexOf(c) >= 0) return '4';
        if ("jkl".indexOf(c) >= 0) return '5';
        if ("mno".indexOf(c) >= 0) return '6';
        if ("pqrs".indexOf(c) >= 0) return '7';
        if ("tuv".indexOf(c) >= 0) return '8';
        if ("wxyz".indexOf(c) >= 0) return '9';

        return '?';
    }
    
    static boolean tn(String s) {
        String res = new StringBuilder(s).reverse().toString();
        return s.equals(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            
            String input = sc.next();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                sb.append(key(input.charAt(i)));
            }

            String converted = sb.toString();

            if (tn(converted)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

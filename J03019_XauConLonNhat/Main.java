package J03019_XauConLonNhat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        
        char best = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= best) {
                sb.append(s.charAt(i));
                best = s.charAt(i);
            }
        }
        
        System.out.println(sb.reverse().toString());
    }
}

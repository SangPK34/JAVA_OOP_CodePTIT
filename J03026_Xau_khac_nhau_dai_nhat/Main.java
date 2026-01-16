package J03026_Xau_khac_nhau_dai_nhat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String A = sc.next();
            String B = sc.next();
            
            if (A.equals(B)) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(A.length(), B.length()));
            }
        }
    }
}

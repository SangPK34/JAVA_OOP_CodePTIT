package J03012_TongSoNguyenLon1;

import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();String b = sc.next();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            BigInteger C = A.add(B);
            System.out.println(C);
        }
    }
}

package J02008_Boi_so_nho_nhat;

import java.util.*;

public class Main {

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
    }
}

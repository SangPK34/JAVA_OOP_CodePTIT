package J01022_Xau_nhi_phan;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {
    static long[] f = new long[93];

    static char solve(int n, long k) {
        while (true) {
            if (n == 1) return '0';
            if (n == 2) return '1';

            if (k <= f[n - 2]) {
                n = n - 2;
            } else {
                k -= f[n - 2];
                n = n - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        f[1] = f[2] = 1;
        for (int i = 3; i < 93; i++) f[i] = f[i - 1] + f[i - 2];

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}

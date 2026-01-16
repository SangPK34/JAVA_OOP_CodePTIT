package J02027_KhoangCachNhoHonK;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);

            long cnt = 0;
            int l = 0;

            for (int r = 1; r < n; r++) {
                while (l < r && a[r] - a[l] >= k) {
                    l++;
                }
                cnt += (r - l);
            }

            System.out.println(cnt);
        }
    }
}

package J02016_BoBaSoPytago;

import java.util.*;

public class Main {

    static boolean check(int[] a) {
        int n = a.length;
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = 1L * a[i] * a[i];
        }

        Arrays.sort(b);

        for (int k = n - 1; k >= 2; k--) {
            int l = 0, r = k - 1;
            while (l < r) {
                long sum = b[l] + b[r];
                if (sum == b[k]) {
                    return true;
                }
                if (sum < b[k]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0; i<n; i++){
                a[i]=sc.nextInt();
            }
            if(check(a)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

package J02028_DayConLienTiepTongBangK;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            int l=0;
            boolean ok = false;
            long sum=0;
            for(int r =0; r<n; r++){
                sum+=a[r];
                while(l<=r && sum>k){
                    sum-=a[l];
                    l++;
                }
                if(sum==k&l<=r){
                    ok=true;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}

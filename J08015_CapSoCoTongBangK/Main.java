package J08015_CapSoCoTongBangK;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long cnt =0;
            Map<Long, Long> mp = new TreeMap<>();
            for(int i=0; i<n; i++){
                long x = sc.nextLong();
                long y= k-x;
                if(mp.containsKey(y)){
                    cnt+= mp.get(y);
                }
                mp.put(x, mp.getOrDefault(x, 0L)+1);
            }
            System.out.println(cnt);
        }
    }
}

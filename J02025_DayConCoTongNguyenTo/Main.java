package J02025_DayConCoTongNguyenTo;

import java.util.*;
public class Main {
    static boolean snt(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i =3; i<=Math.sqrt(n); i+=2) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n   = sc.nextInt();
            int[] a = new int[n];
            for(int i =0; i<n; i++){
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            int x = 1<<n;
            ArrayList<String> A = new ArrayList<>();
            for(int mask = 1; mask<x; mask++){
                int sum = 0;
                StringBuilder sb = new StringBuilder();
                for(int i =n-1; i>=0; i--){
                    if((mask& 1<<i) !=0){
                        sum+=a[i];
                        sb.append(a[i]).append(" ");
                    }
                }
                if(snt(sum)) {
                    A.add(sb.toString().trim());
                }
            }
            A.sort((b, c) -> {
                String[] a1 = b.split(" ");
                String[] a2 = c.split(" ");
                int len = Math.min(a1.length, a2.length);
                for(int i=0; i<len; i++){
                    int x1  = Integer.parseInt(a1[i]);
                    int x2  = Integer.parseInt(a2[i]);
                    if(x1 != x2) return x1-x2;
                }
                return a1.length - a2.length;
            });
            for(String e: A){
                System.out.println(e);
            }
        }
    }
}

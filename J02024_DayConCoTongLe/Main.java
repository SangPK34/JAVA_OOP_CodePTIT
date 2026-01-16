package J02024_DayConCoTongLe;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc. nextInt();
            ArrayList<String> B = new ArrayList<>();
            int[] a= new int[n];
            for(int i =0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            
            int x = 1<<n;
            for(int mask = 1; mask<x; mask++){
                int sum =0;
                String s= "";
                for(int i =n-1; i>=0; i--){
                    if((mask & 1<<i)!=0) {
                        sum+=a[i];
                        s+=a[i]+" ";
                    }
                }
                if(sum%2==1){
                    B.add(s.trim());
                }
            }
            B.sort((s1, s2) -> {
                String[] a1 = s1.split(" ");
                String[] a2 = s2.split(" ");
                int len = Math.min(a1.length, a2.length);
                for (int i = 0; i < len; i++) {
                    int x1 = Integer.parseInt(a1[i]);
                    int x2 = Integer.parseInt(a2[i]);
                    if (x1 != x2) return x1 - x2;
                }
                return a1.length - a2.length;
            });
            for(String e: B){
                System.out.println(e);
            }
        }
    }
}

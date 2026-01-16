package J08012_HinhSao;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < n-1; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            a[u]++;
            a[v]++;
        }
        int ok=0;
        for(int x: a){
            if(x==n-1) {
                System.out.println("Yes");
                ok=1;
                break;
            }
        }
        if(ok==0) System.out.println("No");
    }
}

package J01006_Fibonaci_thu_N;

import java.util.*;

public class Main {

    static long[] a = new long[93];

    static void fibo() {
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < 93; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            fibo();
            System.out.println(a[n]);
        }
    }

}

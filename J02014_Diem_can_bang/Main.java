package J02014_Diem_can_bang;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            int L = 0,ok=0;
            for (int i = 0; i < n; i++) {
                if (sum - L - A[i] == L) {
                    System.out.println(i + 1);
                    ok=1;
                    break;
                }
                L += A[i];
            }
            if(ok==0) System.out.println(-1);
        }

    }
}

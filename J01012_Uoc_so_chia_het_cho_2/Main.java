package J01012_Uoc_so_chia_het_cho_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();
            int cnt = 0;
            for (long i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) {
                        cnt++;
                    }
                    long j = N / i;
                    if (j != i && j % 2 == 0) {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}

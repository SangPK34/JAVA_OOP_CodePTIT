package J01008_Phan_tich_thua_so_nguyen_to;

import java.util.*;

public class Main {

    static ArrayList<Integer> snt = new ArrayList<>();

    static void sang() {
        int M = 32000;
        boolean[] check = new boolean[M + 1];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for (int i = 2; i * i <= M; i++) {
            if (check[i]) {
                for (int j = i * i; j <= M; j += i) {
                    check[j] = false;
                }
            }
        }
        for (int i = 2; i <= M; i++) {
            if (check[i]) {
                snt.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sang();
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            System.out.printf("Test " + k + ": ");

            long n = sc.nextLong();

            for (int x : snt) {
                if (n % x == 0) {
                    int cnt = 0;
                    while (n % x == 0 && n > 0) {
                        n /= x;
                        cnt++;

                    }
                    System.out.printf(x + "(" + cnt + ") ");
                }

            }
            if (n>1) System.out.println(n+ "(1)");
            System.out.println();
        }
    }

}

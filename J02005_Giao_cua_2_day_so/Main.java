package J02005_Giao_cua_2_day_so;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer>B = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }

        A.retainAll(B);   

        for (int x : A) {
            System.out.print(x + " ");
        }
    }
}

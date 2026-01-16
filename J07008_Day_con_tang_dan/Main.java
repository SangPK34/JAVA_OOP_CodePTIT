package J07008_Day_con_tang_dan;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] A = new int[n];
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int tong = 1 << n;
        loop:
        for (int mask = tong - 1; mask >= 0; mask--) {
            int min = -1;
            if (Integer.bitCount(mask) > 1) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        if (A[i] <= min) continue loop;
                        sb.append(A[i] + " ");
                        min = A[i];
                    }
                }
                set.add(sb.toString());
            }
        }
        set.forEach(s -> {
            System.out.println(s);
        });
    }
}

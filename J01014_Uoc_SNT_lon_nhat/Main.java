/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01014_Uoc_SNT_lon_nhat;

import java.util.*;

public class Main {
    static ArrayList<Long> snt = new ArrayList<>();

    static void sang() {
        int M = 100000;
        boolean[] p = new boolean[M+1];
        Arrays.fill(p, true);
        p[0] = p[1] = false;

        for (int i = 2; i * i <= M; i++)
            if (p[i])
                for (int j = i * i; j <= M; j += i)
                    p[j] = false;

        for (int i = 2; i <= M; i++)
            if (p[i]) snt.add((long) i);
    }

    static long maxsnt(long n) {
        long res = -1;
        for (long pr : snt) {
            if (pr * pr > n) break;
            while (n % pr == 0) {
                res = pr;
                n /= pr;
            }
        }
        if (n > 1) res = n; 
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            System.out.println(maxsnt(n));
        }
    }
}

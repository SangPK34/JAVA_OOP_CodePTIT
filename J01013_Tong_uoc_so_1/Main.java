/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01013_Tong_uoc_so_1;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {
    static final int MAX = 2000000;
    static int[] spf = new int[MAX+1];

    static void sieve() {
        for (int i = 2; i <= MAX; i++) spf[i] = i;
        for (int i = 2; i * i <= MAX; i++)
            if (spf[i] == i)
                for (int j = i * i; j <= MAX; j += i)
                    if (spf[j] == j) spf[j] = i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve();

        long ans = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            while (x > 1) {
                ans += spf[x];
                x /= spf[x];
            }
        }
        System.out.println(ans);
    }
}


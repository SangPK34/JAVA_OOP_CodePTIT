/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J02022_So_xa_cach;

import java.util.*;

public class Main {

    static boolean next(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] > a[i+1]) i--;
        if (i < 0) return false;
        int j = a.length - 1;
        while (a[j] < a[i]) j--;
        int t = a[i]; a[i] = a[j]; a[j] = t;
        for (int l = i+1, r = a.length-1; l < r; l++, r--) {
            t = a[l]; a[l] = a[r]; a[r] = t;
        }
        return true;
    }

    static boolean ok(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (Math.abs(a[i] - a[i+1]) == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {

            int N = sc.nextInt();

            int[] a = new int[N];
            for (int i = 0; i < N; i++) a[i] = i + 1;

            do {
                if (ok(a)) {
                    for (int x : a) System.out.print(x);
                    System.out.println();
                }
            } while (next(a));

            System.out.println();
        }
    }
}

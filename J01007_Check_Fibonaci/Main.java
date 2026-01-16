/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01007_Check_Fibonaci;

import java.util.Scanner;

/**
 *
 * @author Sang
 */
public class Main {

    static long[] fib = new long[93];

    static {
        fib[0] = 0;
        fib[1] = 1;
    }

    static void Fibo() {
        for (int i = 2; i <= 92; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    public static void main(String[] args) {
        Fibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int ok = 0;
            for (int i = 0; i < 93; i++) {
                if (fib[i] > n) {
                    break;
                }
                if (fib[i] == n) {
                    System.out.println("YES");
                    ok = 1;
                    break;
                }
            }
            if (ok == 0) {
                System.out.println("NO");
            }
        }
    }
}

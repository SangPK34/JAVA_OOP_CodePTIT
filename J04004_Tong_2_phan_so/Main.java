/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04004_Tong_2_phan_so;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {

    static long gcd(long a, long b) {
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        long k1= gcd(tu1, mau1);
        tu1 /= k1;
        mau1 /= k1;
        long k2= gcd(tu1, mau1);
        tu2 /= k2;
        mau2 /= k2;
        long tu3 = tu1 * mau2 + tu2 * mau1;
        long mau3 = mau1 * mau2;
        long k3 = gcd(tu3, mau3);
        tu3 /= k3;
        mau3 /= k3;
        System.out.println(tu3 + "/" + mau3);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01009_Tong_giai_thua;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0, g = 1;

        for (int i = 1; i <= n; i++) {
            g *= i;   
            s += g;
        }

        System.out.println(s);
    }
}
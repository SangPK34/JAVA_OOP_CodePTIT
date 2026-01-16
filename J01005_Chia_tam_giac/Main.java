/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01005_Chia_tam_giac;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int H = sc.nextInt();
            for (int i = 1; i < n; i++) {
                double h = H * Math.sqrt((double)i / n);
                System.out.printf("%.6f ", h);
            }
            System.out.println();
        }

    }
}

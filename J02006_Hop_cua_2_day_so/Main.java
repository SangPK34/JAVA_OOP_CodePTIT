/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J02006_Hop_cua_2_day_so;

/**
 *
 * @author Sang
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer> B = new TreeSet<>();
        for(int i = 0; i<n; i++) A.add(sc.nextInt());
        for(int i = 0; i<m; i++) B.add(sc.nextInt());
        A.addAll(B);
        for(int x: A) {
            System.out.print(x + " ");
        }
    }
}

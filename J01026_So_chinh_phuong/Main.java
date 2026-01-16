/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01026_So_chinh_phuong;

/**
 *
 * @author Sang
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n= sc.nextLong();
            long a=(long) Math.sqrt(n);
            if(a*a==n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

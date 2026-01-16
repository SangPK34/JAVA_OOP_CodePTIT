/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J03040_Bien_so_dep;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {

    static boolean tangchat(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) >= s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    static boolean bangnhau(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    static boolean daucuoi(String s) {
        int n = s.length();
        for (int i = 0; i < 2; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                return false;
            }
        }
        if (s.charAt(3) != s.charAt(4)) {
            return false;
        }
        return true;
    }

    static boolean locphat(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            String a = s.substring(5, 8) + s.substring(9);
            if (tangchat(a) || bangnhau(a) || daucuoi(a) || locphat(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}

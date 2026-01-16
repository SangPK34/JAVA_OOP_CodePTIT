/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J03013_Hieu_2_so_nguyen_lon_1;

/**
 *
 * @author Sang
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);

            BigInteger C = A.subtract(B).abs();

            String res = C.toString();

            int n = Math.max(a.length(), b.length());
            int need = n - res.length();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < need; i++) sb.append('0');
            sb.append(res);

            System.out.println(sb.toString());
        }
    }
}

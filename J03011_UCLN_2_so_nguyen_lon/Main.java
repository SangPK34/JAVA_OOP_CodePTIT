/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J03011_UCLN_2_so_nguyen_lon;

/**
 *
 * @author Sang
 */
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger A = new BigInteger(sc.next());
            BigInteger B = new BigInteger(sc.next());
            System.out.println(A.gcd(B));
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01011_UCLN_BCNN;

/**
 *
 * @author Sang
 */
import java.math.BigInteger;
import java.util.*;
public class Main {
    
    static long UCLN(long a, long b){
        while(b!=0){
            long t = a%b;
            a=b;
            b=t;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a= sc.nextInt();
            long b = sc.nextInt();
//            BigInteger A = BigInteger.valueOf(a);
//            BigInteger B = BigInteger.valueOf(b);
//            long ucln = A.gcd(B).longValue();
            long ucln = UCLN(a, b);
            long bcnn = a*b/ucln;
            System.out.println(bcnn +" "+ucln);
        }
    }
}

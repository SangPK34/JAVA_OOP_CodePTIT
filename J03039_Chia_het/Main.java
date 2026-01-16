/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J03039_Chia_het;

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
        while(t-->0){
            BigInteger A = new BigInteger(sc.next());
            BigInteger B = new BigInteger(sc.next());
            if(A.compareTo(B) == 1) {
                if(A.mod(B).toString() == "0") System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if(B.mod(A).toString() == "0") System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}

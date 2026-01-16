/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01018_So_khong_lien_ke;

/**
 *
 * @author Sang
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        run:
        while(t-- >0){
            String s = sc.next();
            int A =s.charAt(0)-'0';
            for(int i =1; i<s.length(); i++){
                A+= s.charAt(i)-'0';
                if(Math.abs(s.charAt(i)-s.charAt(i-1))!=2){
                    System.out.println("NO");
                    continue run;
                }
            }
            if(A%10!=0){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}

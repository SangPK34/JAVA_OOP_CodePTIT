/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01017_So_lien_ke;

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
            for(int i =0; i<s.length()-1; i++){
                if(Math.abs(s.charAt(i)-s.charAt(i+1))!=1){
                    System.out.println("NO");
                    continue run;
                }
            }
                System.out.println("YES");
        }
    }
}

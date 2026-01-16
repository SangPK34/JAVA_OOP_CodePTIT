/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J03024_So_uu_the;

/**
 *
 * @author Sang
 */
import java.util.*;
public class Main {
    static String check(String s){
        int n= s.length();
        int L=0;
        int C=0;
        if(s.charAt(0)=='0') return "INVALID";
        for(int i=0; i<n; i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return "INVALID";
            }
            if((s.charAt(i)-'0')%2==0)C++;
            else L++;
        }
        if(n%2==0 && C>L) return "YES";
        else if(n%2==1 && L>C) return "YES";
        else return "NO";
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}

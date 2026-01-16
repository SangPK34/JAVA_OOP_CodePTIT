/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT1;

/**
 *
 * @author Sang
 */
import java.util.*;
import java.io.*;

public class Bai1 {
    static ArrayList<String> res = new ArrayList<>();
    static void Try(int i, int n, String s){
        if(!s.isEmpty()) res.add(s);
        if(i==n) return;
        Try(i+1,n,s+"6");
        Try(i+1,n,s+"8");
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Try(0, 15, "");
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if(a.length() == b.length()) return a.compareTo(b);
                return a.length() - b.length();
            }
        });
        while(t-->0){
            int n=sc.nextInt();
            int cnt=0;
            for(int i=0;i<res.size();i++){
                if(res.get(i).length()<=n) cnt++;
                else break;
            }
            System.out.println(cnt);
            for(int i=cnt-1;i>=0;i--){
                if(res.get(i).length()<=n) System.out.printf("%s ",res.get(i));
            }
            System.out.println();
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J03038_Danh_dau_chu_cai;

import java.util.*;

/**
 *
 * @author Sang
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> chu = new HashSet<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            chu.add(s.charAt(i));
        }
        System.out.println(chu.size());
        
    }
}

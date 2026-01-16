/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT1;

/**
 *
 * @author Sang
 */
import java.util.Scanner;

public class Bai2 {
    static int tong(int n){
        int s = 1; 
        if(n == 1) return 0;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                s += i;
                if(s>n) return (n-1);
                if(i != n / i) s += n / i;
                if(s>n) return (n-1);
            }
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(tong(i) > i) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}


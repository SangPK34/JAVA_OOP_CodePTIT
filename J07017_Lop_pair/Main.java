package J07017_Lop_pair;

import java.util.*;
import java.io.*;

public class Main {

    public static boolean Prime(int x) {
        if(x<2) return false;
        for(int i=2; i*i<=x; i++) if (x%i==0) return false;
        return true;
            
    }
    
    static class Pair<p1, p2> {

        public p1 first;
        public p2 second;

        public Pair(p1 a, p2 b) {
            first = a;
            second = b;
        }

        public boolean isPrime() {
            return Prime((Integer) first) && Prime((Integer) second);
        }

        @Override
        public String toString() {
            return first.toString() + " " + second.toString();
        }

    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}


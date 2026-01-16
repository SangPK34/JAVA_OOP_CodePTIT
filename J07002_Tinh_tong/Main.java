package J07002_Tinh_tong;

import java.util.*;
import java.io.*;
public class Main {
    static boolean checkint(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        File x = new File("DATA.in");
        long A = 0;
        try {
            Scanner sc = new Scanner(x);
            while(sc.hasNext()){
                String w = sc.next();
                if(checkint(w)) A+= Integer.parseInt(w);
            }
        } 
        catch (FileNotFoundException e) {
        }
        System.out.println(A);
    }
}

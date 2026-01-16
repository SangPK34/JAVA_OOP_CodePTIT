package J07003_Tach_doi_va_tinh_tong;

import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {
    
    static String chiadoi(String s){
        int n = s.length();
        String L = s.substring(0, n/2);
        String R = s.substring(n/2);
        BigInteger A = new BigInteger(L);
        BigInteger B = new BigInteger(R);
        BigInteger C = A.add(B);
        return C.toString();
    }
    
    public static void main(String[] args) {
        File x = new File("DATA.in");
        String s="";
        try {
            Scanner sc = new Scanner(x);
            s= sc.nextLine().trim();
        } catch (FileNotFoundException e) {
        }
        while(s.length()>1){
            s = chiadoi(s);
            System.out.println(s);
        }
        
    }
}

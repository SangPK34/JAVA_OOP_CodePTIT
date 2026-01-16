package J07010_DS_Sinh_Vien_trong_file_2;

import java.util.*;
import java.io.*;

class SV{
    String ten, msv, lop, ns;
    double gpa;
    
    public SV(int i, String ten,  String lop, String ns, double gpa) {
        this.msv = String.format("B20DCCN%03d",i+1);
        this.ten = ten;
        this.lop = lop;
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(1)=='/') sb.insert(0, '0');
        if(sb.charAt(4)=='/') sb.insert(3, '0');
        this.ns = sb.toString();
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0; i<n; i++){
            System.out.println((new SV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()))));
        }
    }
}

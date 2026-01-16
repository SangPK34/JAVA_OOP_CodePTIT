package J07053_Xet_tuyen;

import java.util.*;
import java.io.*;

class PH{
    String ma, ten, ns, tt;
    double lt, th, cong;
    int tong, tuoi;

    public PH(int i, String ten, String ns, double lt, double th) {
        this.ma = String.format("PH%02d", i+1);
        String[] A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w:A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1)sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        StringBuilder sb2 = new StringBuilder(ns.trim());
        if(sb2.charAt(1)=='/') sb2.insert(0, '0');
        if(sb2.charAt(4)=='/') sb2.insert(3, '0');
        this.ns = sb2.toString();
        this.tuoi= 2021-Integer.parseInt(this.ns.substring(6));
        this.lt = lt;
        this.th = th;
        if(lt>=8 && th>=8) this.cong =1;
        else if(lt<8.5 || th<8.5) this.cong = 0;
        else this.cong = 0.5;
        int x= (int) Math.round((lt+th)/2+cong);
        if (x>10) x=10;
        this.tong = x;
        if(tong==9||tong==10) tt = "Xuat sac";
        else if(tong ==8) tt ="Gioi";
        else if(tong ==7) tt ="Kha";
        else if(tong ==5 || tong==6) tt ="Trung binh";
        else tt= "Truot";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " "+ tuoi +  " " + tong + " " + tt ;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n= Integer.parseInt(sc.nextLine().trim());
        ArrayList<PH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new PH(i, sc.nextLine().trim(),sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim())));
        }
        for(PH e: A){
            System.out.println(e);
        }
    }
}

package J05060_Ket_Qua_Xet_Tuyen;

import java.util.*;

class PH{
    String ma, ten, ns, tt;
    int tuoi, tb;
    double d1, d2, thuong;

    public PH(int i, String ten, String ns, double d1, double d2) {
        this.ma = String.format("PH%02d", i+1);
        this.ten = ten;
        this.ns = ns;
        this.tuoi =2021- Integer.parseInt(ns.substring(6));
        this.d1 = d1;
        this.d2 = d2;
        if(d1>=8 && d2>=8) thuong = 1;
        else if(d1>=7.5 && d2>=7.5) thuong = 0.5;
        else thuong=0;
        tb = (int)Math.round((d1+d2)/2+thuong);
        if(tb>10) tb=10;
        if(tb<5) tt= "Truot";
        else if(tb<=6) tt= "Trung binh";
        else if(tb==7) tt= "Kha";
        else if(tb==8) tt= "Gioi";
        else if(tb>=9) tt= "Xuat sac";
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + tuoi + " " + tb + " "+ tt;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<PH> A = new ArrayList<>();
       for(int i =0; i<n; i++){
           A.add(new PH(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
       }
       for(PH e: A){
           System.out.println(e);
       }
    }
}

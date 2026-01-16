package J07056_Tinh_tien_dien;

import java.io.*;
import java.util.*;

class KH{
    String ma,ten, loai;
    int dau, cuoi, dm, trong, vuot, vat, tong;

    public KH(int i, String ten, String s2) {
        this.ma = String.format("KH%02d", i+1);
        String[] A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        String B[] = s2.trim().split("\\s+");
        this.loai = B[0];
        this.dau = Integer.parseInt(B[1]);
        this.cuoi = Integer.parseInt(B[2]);
        if(loai.equals("A")) this.dm = 100;
        if(loai.equals("B")) this.dm = 500;
        if(loai.equals("C")) this.dm = 200;
        int n =cuoi-dau;
        if((n)<=dm) {
            trong = n*450;
            vuot= 0;
        }
        else {
            trong = dm*450;
            vuot= (n-dm)*1000;
        }
        this.vat= vuot*5/100;
        this.tong= trong+vuot+vat;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + trong + " " + vuot + " " + vat + " " + tong;
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new KH(i, sc.nextLine().trim(), sc.nextLine().trim()));
        }
        A.sort((a, b)->{
            return b.tong-a.tong;
        });
        for(KH e: A){
            System.out.println(e);
        }
    }
}

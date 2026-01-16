package J05068_Sap_Xep_Bang_Gia_Xang_Dau;

import java.util.*;

class MH{
    String ma, dau, cuoi, ten;
    double sl, dgia, thue, tong;;

    public MH(String s) {
        String[]A = s.split("\\s+");
        this.ma = A[0];
        this.sl = Double.parseDouble(A[1]);
        dau = ma. substring(0, 1);
        cuoi = ma.substring(3);
        if(dau.equals("X")) {
            dgia = 128000;
            thue = 0.03;
        }
        else if(dau.equals("D")) {
            dgia = 11200;
            thue = 0.035; 
        }
        else if(dau.equals("N")) {
            dgia = 9700;
            thue = 0.02; 
        }
        if(cuoi.equals("BP")) ten = "British Petro";
        else if(cuoi.equals("ES")) ten = "Esso";
        else if(cuoi.equals("SH")) ten = "Shell";
        else if(cuoi.equals("CA")) ten = "Castrol";
        else if(cuoi.equals("MO")) ten = "Mobil";
        else if(cuoi.equals("TN")) {
            ten = "Trong Nuoc";
            thue=0;
        }
        thue = thue*dgia*sl;
        tong = dgia*sl+thue;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.0f", dgia) + " " + String.format("%.0f", thue) + " " + String.format("%.0f", tong);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int  n= Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc.nextLine()));
        }
        A.sort((a, b)->{
            return Double.compare(b.tong, a.tong);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}

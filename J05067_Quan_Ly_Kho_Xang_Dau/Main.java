package J05067_Quan_Ly_Kho_Xang_Dau;

import java.util.*;

class MH{
    String ma, hang ;
    long sl, dgia;
    double thue, tong;

    public MH(String ma, long sl) {
        this.ma = ma;
        this.sl = sl;
        if(ma.substring(0, 1).equals("X")) {
            this.dgia = 128000;
            thue =(double) dgia*sl*3.0/100;
        }
        else if(ma.substring(0, 1).equals("D")) {
            this.dgia = 11200;
            thue =(double) dgia*sl*35.0/1000;
        }
        else {
            this.dgia = 9700;
            thue = (double)dgia*sl*2.0/100;
        }
        
        
        if(ma.substring(ma.length()-2).equals("BP")) {
            this.hang = "British Petro";
        }
        else if(ma.substring(ma.length()-2).equals("ES")) {
            this.hang = "Esso";
        }
        else if(ma.substring(ma.length()-2).equals("SH")) {
            this.hang = "Shell";
        }
        else if(ma.substring(ma.length()-2).equals("CA")) {
            this.hang = "Castrol";
        }
        else if(ma.substring(ma.length()-2).equals("MO")) {
            this.hang = "Mobil";
        }
        else {
            this.hang = "Trong Nuoc";
            this.thue = 0;
        }
        this.tong = (double) thue+ dgia*sl;
    }
    
    
    
    @Override
    public String toString() {
        return ma + " " + hang + " " + dgia + " " + String.format("%.0f",thue) + " " + String.format("%.0f",tong);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc.next(), sc.nextLong()));
            sc.nextLine();
        }
        for(MH e: A){
            System.out.println(e);
        }
    }
}


package J05036_Tinh_Gia_Ban_1;

import java.util.*;

class MH{
    String ma, ten, dvi;
    double vchuyen, ttien,dgia, sl, giaban;;

    public MH(int i , String ten, String dvi, double dgia, double sl) {
        this.ma = String.format("MH%02d", i+1);
        this.ten = ten;
        this.dvi = dvi;
        this.dgia = dgia;
        this.sl = sl;
        this.vchuyen = dgia*sl*5/100;
        this.ttien = dgia*sl+vchuyen;
        giaban = ttien*102/100;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + String.format("%.0f", vchuyen) + " " + String.format("%.0f", ttien) + " " + String.format("%.0f", giaban) ;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(MH e: A) {
            System.out.println(e);
        }
    }
}

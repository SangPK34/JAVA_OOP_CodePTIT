package J05037_Tinh_Gia_Ban_2;

import java.util.*;

class MH{
    String ma, ten, dvi;
    double dgia, sl, vc, tong, le;

    public MH(int i, String ten, String dvi, double dgia, double sl) {
        this.ma = String.format("MH%02d", i+1);
        this.ten = ten;
        this.dvi = dvi;
        this.dgia = dgia;
        this.sl = sl;
        this.vc = dgia*sl*5/100;
        this.tong = dgia*sl+ this.vc;
        this.le = this.tong*102/100/sl;
    }
    
    public long tron(double x){
        return (long) Math.ceil(x / 100) * 100;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + Math.round(vc) + " " + Math.round(tong) + " " + tron(le);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        A.sort((a, b)->{
            return Double.compare(b.le, a.le);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}

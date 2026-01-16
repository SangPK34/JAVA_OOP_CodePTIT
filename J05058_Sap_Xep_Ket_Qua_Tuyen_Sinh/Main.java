package J05058_Sap_Xep_Ket_Qua_Tuyen_Sinh;
import java.util.*;

class SV{
    String ma, ten, tt;
    double d1, d2, d3, ut, tong;

    public SV(String ma, String ten, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        if(ma.substring(0, 3).equals("KV1")) ut= 0.5;
        else if(ma.substring(0, 3).equals("KV2")) ut= 1.0;
        else if(ma.substring(0, 3).equals("KV3")) ut= 2.5;
        this.tong = d1*2+d2+d3+ut;
        if(tong>=24) tt = "TRUNG TUYEN";
        else tt="TRUOT";
    }
    public String tron(double x){
        if((long) x == x) return String.valueOf((long)x);
        return String.valueOf(Math.round(x*10.0)/10.0);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tron(ut) + " " + tron(tong) + " " + tt;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        A.sort((a, b)->{
            if(a.tong!=b.tong) return Double.compare(b.tong, a.tong);
            return a.ma.compareTo(b.ma);
        });
        for(SV e: A){
            System.out.println(e);
        }
    }
}

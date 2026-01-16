package J05018_Bang_Diem_Hoc_Sinh;

import java.util.*;

class HS{
    String ma, ten, loai;
    double toan, tv, nn, vly, hoa, sinh, su, dia, cd, cn, tb;

    public HS(int i, String ten, String s) {
        String[] A = s.split("\\s+");
        this.ma = String.format("HS%02d", i+1);
        this.ten = ten;
        this.toan = Double.parseDouble(A[0]);
        this.tv = Double.parseDouble(A[1]);
        this.nn = Double.parseDouble(A[2]);
        this.vly = Double.parseDouble(A[3]);
        this.hoa = Double.parseDouble(A[4]);
        this.sinh = Double.parseDouble(A[5]);
        this.su = Double.parseDouble(A[6]);
        this.dia = Double.parseDouble(A[7]);
        this.cd = Double.parseDouble(A[8]);
        this.cn = Double.parseDouble(A[9]);
        double raw = (double) ((toan+tv)*2.0 + nn+ vly+ hoa+ sinh+ su+ dia+ cd+ cn)/12;
        this.tb = Math.round(raw*10)/10.0;
        if(tb >=9) loai = "XUAT SAC";
        else if (tb >=8) loai = "GIOI";
        else if (tb >=7) loai = "KHA";
        else if (tb >=5) loai = "TB";
        else loai = "YEU";
    }

    @Override
    public String toString() {
        return  ma + " " + ten+ " " + String.format("%.1f", tb) + " " + loai  ;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HS> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new HS(i, sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b)->{
            if(a.tb != b.tb) return Double.compare(b.tb, a.tb);
            return a.ma.compareTo(b.ma);
        });
        for(HS e: A){
            System.out.println(e);
        }
    }
}

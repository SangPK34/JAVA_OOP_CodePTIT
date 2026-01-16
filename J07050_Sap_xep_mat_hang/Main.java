package J07050_Sap_xep_mat_hang;

import java.util.*;
import java.io.*;

class MH{
    String ma, ten, nhom;
    double mua, ban, loi;

    public MH(int i, String ten, String nhom, double mua, double ban) {
        this.ma = String.format("MH%02d", i+1);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loi = ban-mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loi);
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new MH(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        A.sort((a, b) -> {
            return Double.compare(b.loi,a.loi);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}

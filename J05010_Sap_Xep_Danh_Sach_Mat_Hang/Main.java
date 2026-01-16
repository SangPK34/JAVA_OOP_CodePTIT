package J05010_Sap_Xep_Danh_Sach_Mat_Hang;

import java.util.*;

class MH{
    int ma;
    String ten, nhom;
    double mua, ban, loi;

    public MH(int i, String ten, String nhom, double mua, double ban) {
        this.ma = i+1;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loi = this.ban-this.mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loi);
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new MH(i, sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        A.sort((a, b)->{
            return Double.compare(b.loi, a.loi);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}

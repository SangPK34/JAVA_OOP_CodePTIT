package J05081_Danh_sach_mat_hang;

import java.util.*;

class MH{
    String ma, ten, dvi;
    int mua, ban, loi;
    
    public MH(int i, String ten, String dvi, int mua, int ban){
        this.ma= String.format("MH%03d", i+1);
        this.ten = ten;
        this.dvi=dvi;
        this.mua= mua;
        this.ban= ban;
        this.loi= ban-mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + mua + " " + ban + " " + loi;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> list = new ArrayList<>();
        for( int i =0; i<n; i++){
            list.add(new MH(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        list.sort((a, b) -> {
            if(a.loi != b.loi) return Integer.compare(b.loi, a.loi);
            return a.ma.compareTo(b.ma);
        });
        for(MH x: list){
            System.out.println(x);
        }
    }
}

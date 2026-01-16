package J07073_Dang_Ky_hinh_thuc_giang_day;

import java.util.*;
import java.io.*;

class MH{
    String ma, ten, tin, lt, th;

    public MH(String ma, String ten, String tin, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
        this.lt = lt;
        this.th = th;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tin + " " + lt + " " + th;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b) -> {
            return a.ma.compareTo(b.ma);
        });
        for(MH e: A){
            if(!e.th.equals("Truc tiep")) System.out.println(e);
        }
    }
}

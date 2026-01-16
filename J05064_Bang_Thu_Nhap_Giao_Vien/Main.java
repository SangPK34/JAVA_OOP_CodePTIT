package J05064_Bang_Thu_Nhap_Giao_Vien;

import java.util.*;

class GV{
    String ma, ten, chuc;
    long  bac, lcb, pc, tong;
    boolean tt;

    public GV(String ma, String ten, long lcb) {
        this.ma = ma;
        this.chuc = ma.substring(0, 2);
        bac = Long.parseLong(ma.substring(2));
        if(chuc.equals("HT")) pc = 2000000;
        else if(chuc.equals("HP")) pc = 900000;
        else if(chuc.equals("GV")) pc = 500000;
        this.ten = ten;
        this.lcb = lcb;
        tong = lcb*bac+pc;
        tt=true;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bac + " " + pc + " " + tong ;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> A = new ArrayList<>();
        int HT=0, HP=0;
        for(int i =0; i<n; i++){
            GV e = new GV(sc.nextLine().trim(), sc.nextLine().trim(), Long.parseLong(sc.nextLine().trim()));
            if(e.ma.substring(0, 2).equals("HT")) {
                HT++;
                if(HT>1) e.tt=false;
            }
            if(e.ma.substring(0, 2).equals("HP")) {
                HP++;
                if(HP>2) e.tt=false;
            }
            A.add(e);     
        }
        for(GV e: A){
            if(e.tt) System.out.println(e);
        }
    }
}

package J04015_Tinh_thu_nhap_giao_vien;

import java.util.*;
class GV{
    String ma, ten, bac;
    long lcb, pc, tong, heso;

    public GV(String ma, String ten, long lcb){
        this.ma= ma;
        this.ten=ten;
        this.lcb= lcb;
    }
    
    public void xuly(){
        heso = Integer.parseInt(ma.substring(2));
        bac = ma.substring(0,2);
        if(bac.equals("HT")) pc = 2000000;
        else if(bac.equals("HP")) pc= 900000;
        else if(bac.equals("GV")) pc= 500000;    
        tong = pc+lcb*heso;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        long lcb = sc.nextLong();
        GV gv1 = new GV(ma, ten, lcb);
        gv1.xuly();
        System.out.println(gv1.ma+" " + ten + " " + gv1.heso + " " + gv1.pc + " " + gv1.tong);
    }
}

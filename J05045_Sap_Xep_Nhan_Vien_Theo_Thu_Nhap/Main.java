package J05045_Sap_Xep_Nhan_Vien_Theo_Thu_Nhap;

import java.util.*;

class NV{
    String ma, ten, chuc;
    long lcb, ngay, lchinh, pcap, tong, ung, con;

    public NV(int i, String ten, String chuc, long lcb, long ngay) {
        this.ma = String.format("NV%02d", i+1);
        this.ten = ten;
        this.chuc = chuc;
        this.lcb = lcb;
        this.ngay = ngay;
        lchinh = lcb*ngay;
        if(chuc.equals("GD")) pcap = 500;
        else if(chuc.equals("PGD")) pcap = 400;
        else if(chuc.equals("TP")) pcap = 300;
        else if(chuc.equals("KT")) pcap = 250;
        else pcap = 100;
        tong  = lchinh+pcap;
        double tam = tong * 2.0 / 3;
        if (tam < 25000) ung = Math.round(tam / 1000) * 1000;
        else ung = 25000;
        con = tong-ung;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " "+ pcap  +  " " +lchinh + " " + ung + " " + con;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NV> A =new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new NV(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        A.sort((a, b)->{
            if(a.tong!=b.tong) return Long.compare(b.tong, a.tong);
            return a.ma.compareTo(b.ma);
        });
        for(NV e: A){
            System.out.println(e);
        }
    }
}

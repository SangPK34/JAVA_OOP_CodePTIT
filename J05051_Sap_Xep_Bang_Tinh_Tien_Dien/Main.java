package J05051_Sap_Xep_Bang_Tinh_Tien_Dien;

import java.util.*;

class KH{
    String ma, loai;
    long heso, truoc, sau, so, ttien,  phu, tong;

    public KH(int i, String loai, long truoc, long sau) {
        this.ma = String.format("KH%02d", i+1);
        this.loai = loai;
        this.truoc = truoc;
        this.sau = sau;
        this.so = sau-truoc;
        if(loai.equals("KD")) this.heso = 3;
        else if(loai.equals("NN")) this.heso = 5;
        else if(loai.equals("TT")) this.heso = 4;
        else if(loai.equals("CN")) this.heso = 2;
        this.ttien = so*heso*550;
        if(so<50)phu=0;
        else if(so<=100) phu=Math.round(ttien*35.0/100);
        else phu = ttien;
        this.tong=  ttien+phu;
    }

    @Override
    public String toString() {
        return  ma + " " + heso + " " + ttien + " " + phu + " " + tong ;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new KH(i,sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()) ));
        }
        A.sort((a, b)->{
            return Long.compare(b.tong, a.tong);
        });
        for(KH e: A){
            System.out.println(e);
        }
    }
}

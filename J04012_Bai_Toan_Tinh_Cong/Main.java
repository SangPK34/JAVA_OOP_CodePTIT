package J04012_Bai_Toan_Tinh_Cong;

import java.util.*;

class NV{
    String ma, ten, chuc;
    int lcb, ngay, pcap, luong ,thuong, tong;

    public NV(int i, String ten, int lcb, int ngay, String chuc) {
        this.ma = String.format("NV%02d", i+1);
        this.ten = ten;
        this.chuc = chuc;
        this.lcb = lcb;
        this.ngay = ngay;
        this.luong = lcb*ngay;
        if(ngay>=25) this.thuong =  luong*20/100;
        else if(ngay>=22) this.thuong=  luong*10/100;
        else this.thuong = 0;
        if(chuc.equals("GD")) this.pcap = 250000;
        else if(chuc.equals("PGD")) this.pcap = 200000;
        else if(chuc.equals("TP")) this.pcap = 180000;
        else if(chuc.equals("NV")) this.pcap = 150000;
        this.tong = luong + thuong + this.pcap;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luong + " " + thuong + " " + pcap + " " + tong;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        ArrayList<NV> A  = new ArrayList<>();
        int i =0;
        while(sc.hasNextLine()){
            A.add(new NV(i, sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim()), Integer.parseInt(sc.nextLine().trim()),sc.nextLine().trim() ));
            i++;
        }
        for(NV e: A){
            System.out.println(e);
        }
    }
}

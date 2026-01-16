package J05041_Sap_Xep_Bang_Tinh_Cong;

import java.util.*;

class NV{
    String ma, ten, chuc;
    Double luongngay, songay,luongthang, thuong, pcap, tong;

    public NV(int i , String ten, Double luongngay, Double songay, String chuc) {
        this.ma = String.format("NV%02d", i+1);
        this.ten = ten;
        this.chuc = chuc;
        this.luongngay = luongngay;
        this.songay = songay;
        luongthang = luongngay*songay;
        if(songay>=25) thuong = luongthang*20/100;
        else if(songay>=22) thuong= luongthang*10/100;
        else thuong =0.0;
        if(chuc.equals("GD")) pcap = 250000.0;
        else if(chuc.equals("PGD")) pcap = 200000.0;
        else if(chuc.equals("TP")) pcap = 180000.0;
        else pcap = 150000.0;
        this.tong = luongthang+ thuong+pcap;
    }

    @Override
    public String toString() {
        return ma + " "  +ten + " " + Math.round(luongthang) + " " + Math.round(thuong) + " " + Math.round(pcap) + " " + Math.round(tong) ;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new NV(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine()));
        }
        A.sort((a, b)->{
            return Double.compare(b.tong, a.tong);
        });
        for(NV e: A){
            System.out.println(e);
        }
    }
}

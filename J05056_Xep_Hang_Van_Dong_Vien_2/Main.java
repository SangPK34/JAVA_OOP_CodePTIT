package J05056_Xep_Hang_Van_Dong_Vien_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class VDV{
    String ma, ten, ns, s, e;
    int kc, ut, tong, rank;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
    public VDV(int i, String ten, String ns, String s, String e) {
        this.ma = String.format("VDV%02d", i+1);
        this.ten = ten;
        this.ns = ns;
        this.s = s;
        this.e = e;
        int tuoi = 2021-Integer.parseInt(ns.substring(6));
        if(tuoi<18) ut=0;
        else if(tuoi<25) ut=1;
        else if(tuoi<32) ut=2;
        else ut= 3;  
        LocalTime d1 = LocalTime.parse(s, f);
        LocalTime d2 = LocalTime.parse(e, f);
        this.kc = (int) ChronoUnit.SECONDS.between(d1, d2);
        tong=kc-ut;
        rank=1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + LocalTime.ofSecondOfDay(kc).format(f) + " " + LocalTime.ofSecondOfDay(ut).format(f) + " " + LocalTime.ofSecondOfDay(tong).format(f) + " " + rank;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VDV> A =new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new VDV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b)->{
            return a.tong-b.tong;
        });
        System.out.println(A.get(0));
        for(int i=1; i<n; i++){
            if(A.get(i).tong!=A.get(i-1).tong){
                A.get(i).rank = i+1;        
            }
            else A.get(i).rank = A.get(i-1).rank;
            System.out.println(A.get(i));
        }
    }
}
//5
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
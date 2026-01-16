package J05055_Xep_Hang_Van_Dong_Vien_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class VDV{
    String ma, ten , ns, start, end, tgiangoc, tgianut, ttich;
    int ut,tong, hang;

    public VDV(int i, String ten, String ns, String start, String end) {
        this.ma = String.format("VDV%02d", i+1);
        this.ten = ten;
        this.ns = ns;
        this.start = start;
        this.end = end;
        int tuoi = 2021-Integer.parseInt(ns.substring(6));
        if(tuoi<18) ut=0;
        else if(tuoi<25) ut=1;
        else if(tuoi<32) ut=2;
        else ut=3;
        DateTimeFormatter f =  DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime d1 = LocalTime.parse(start, f);
        LocalTime d2 = LocalTime.parse(end, f);
        long kc = ChronoUnit.SECONDS.between(d1, d2);
        LocalTime d3 = LocalTime.ofSecondOfDay(kc);
        this.tgiangoc = d3.format(f);
        this.tgianut = LocalTime.ofSecondOfDay(ut).format(f);
        this.hang = 1;
        this.ttich = LocalTime.ofSecondOfDay(kc-ut).format(f);
        this.tong=(int)kc-ut;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tgiangoc + " " + tgianut + " " +ttich + " " + hang;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = Integer.parseInt(sc.nextLine());
        ArrayList<VDV> A =new ArrayList<>();
        ArrayList<String> stt = new ArrayList<>();
        for(int i=0; i<n; i++){
            VDV e = new VDV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            A.add(e);
            stt.add(e.ma);
        }
        A.sort((a, b)->{
            return a.tong-b.tong;
        });
        int j=1;
        int min = A.get(0).tong;
            for(int i=1; i<n; i++){
                if(A.get(i).tong==min){
                    A.get(i).hang= A.get(i-1).hang;
                    j++;
                }
                else {
                    j++;
                   min = A.get(i).tong;
                   A.get(i).hang= j;
                   
                }  
            }
        for(String w: stt){
            for(VDV e: A){
            if(w.equals(e.ma))System.out.println(e);
        }
        }
    }
}
//5
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
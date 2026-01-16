package J07059_DS_Ca_thi;

import java.util.*;
import java.io.*;

class CT{
    String ma, ngay, gio, phong, day;
    int time;

    public CT(int i, String ngay, String gio, String phong) {
        this.ma = String.format("C%03d", i+1);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
        String[] A = ngay.split("/");
        this.day= A[2]+A[1]+A[0];
        this.time= Integer.parseInt(gio.substring(0, 2))*60 + Integer.parseInt(gio.substring(3));
    }

    @Override
    public String toString() {
        return ma + " " + ngay + " " + gio + " " + phong;
    }
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CT> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new CT(i, sc.nextLine(), sc.nextLine(),  sc.nextLine() ));
        }
        A.sort((a, b) -> {
            if(!a.day.equals(b.day)) return a.day.compareTo(b.day);
            else if(a.time != b.time) return a.time - b.time;
            else return a.ma.compareTo(b.ma);
        });
        for(CT e: A){
            System.out.println(e);
        }
    }
}

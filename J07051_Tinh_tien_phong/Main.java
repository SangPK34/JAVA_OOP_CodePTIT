package J07051_Tinh_tien_phong;

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

class KH{
    String ma, ten, phong, nhan, tra;
    int songay,gia, ps, tong;

    public KH(int i, String ten, String phong, String nhan, String tra, int ps) {
        this.ma = String.format("KH%02d", i+1);
        String[] A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        this.phong = phong.trim();
        StringBuilder sb1= new StringBuilder(nhan.trim());
        if(sb1.charAt(1)=='/') sb1.insert(0, '0');
        if(sb1.charAt(4)=='/') sb1.insert(3, '0');
        StringBuilder sb2= new StringBuilder(tra.trim());
        if(sb2.charAt(1)=='/') sb2.insert(0, '0');
        if(sb2.charAt(4)=='/') sb2.insert(3, '0');
        this.nhan = sb1.toString();
        this.tra = sb2.toString();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 =LocalDate.parse(this.nhan, f);
        LocalDate d2 =LocalDate.parse(this.tra, f);
        long kc= ChronoUnit.DAYS.between(d1, d2);
        this.songay = (int)kc+1;
        this.ps = ps;
        if(phong.charAt(0)=='1') gia = 25;
        if(phong.charAt(0)=='2') gia = 34;
        if(phong.charAt(0)=='3') gia = 50;
        if(phong.charAt(0)=='4') gia = 80;
        this.tong= this.songay*gia+ps;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phong + " " + songay + " " + tong;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        A.sort((a, b) -> {
            return Integer.compare(b.tong,a.tong);
        });
        for(KH e: A){
            System.out.println(e);
        }
    }
}

package J07046_DS_Luu_tru;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class KH{
    String ma, ten, phong, den, di;
    int ngay;

    public KH(int i, String ten, String phong, String den, String di) {
        this.ma = String.format("KH%02d", i+1);
        this.ten = ten;
        this.phong = phong;
        this.den = den;
        this.di = di;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(den, f);
        LocalDate d2 = LocalDate.parse(di, f);
        long kc= ChronoUnit.DAYS.between(d1, d2);
        this.ngay = (int) kc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phong + " " + ngay;
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> A= new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b) -> {
            return b.ngay-a.ngay;
        });
        for(KH e: A){
            System.out.println(e);
        }
    }
}

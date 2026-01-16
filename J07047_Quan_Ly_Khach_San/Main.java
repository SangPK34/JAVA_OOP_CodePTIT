import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Phong{
    String ma, ten;
    double dgia, pvu;
    public Phong(String s) {
        String[] A = s.trim().split("\\s+");
        this.ma = A[0];
        this.ten = A[1];
        this.dgia = Double.parseDouble(A[2]);
        this.pvu = Double.parseDouble(A[3]);
    } 
}

class KH{
    String ma, ten, maphong, s, e;
    long ngay, ngaygoc;
    double giam, tong;
    public KH(int i, String ten, String maphong, String s, String e) {
        this.ma = String.format("KH%02d", i+1);
        this.ten = ten;
        this.maphong = maphong;
        this.s = s;
        this.e = e;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(s, f);
        LocalDate d2 = LocalDate.parse(e, f);
        ngaygoc = ChronoUnit.DAYS.between(d1, d2);
        if(ngaygoc==0) ngay=1;
        else ngay = ngaygoc;
        if(ngay<10) giam=0;
        else if(ngay<20) giam=0.02;
        else if(ngay<=30) giam=0.04;
        else  giam=0.06;    
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + maphong + " " + ngay + " " + String.format("%.2f", tong);
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Phong> A = new ArrayList<>();  
        for(int i =0; i<n; i++){
            A.add(new Phong(sc.nextLine()));
        }
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<KH> B = new ArrayList<>();
        for(int i =0; i<k; i++){
            KH e = new KH(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
            for(Phong f: A){
                if(e.maphong.charAt(2)==f.ma.charAt(0)){
                    double gia = f.dgia * e.ngay;
                    e.tong = gia * (1 - e.giam) * (1 + f.pvu);
                    break;
                }
            }
            B.add(e);
        }
        B.sort((a, b)->{
            return Long.compare(b.ngaygoc, a.ngaygoc);
        });
        for(KH e: B){
            System.out.println(e);
        }
    }
}

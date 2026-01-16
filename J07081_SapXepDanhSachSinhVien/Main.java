package J07081_SapXepDanhSachSinhVien;

import java.util.*;
import java.io.*;

class SV{
    String ma, ten, sdt, mail, ho, dem , chinh;

    public SV(String ma, String ten, String sdt, String mail) {
        String [] A = ten.split("\\s");
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.mail = mail;
        this.chinh = A[A.length-1];
        this.ho= A[0];
        this.dem = String.join(" ", Arrays.copyOfRange(A, 1, A.length-1));
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + mail;
    }
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner (new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A  = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        A.sort((a, b) -> {
            if(!a.chinh.equals(b.chinh)) return a.chinh.compareTo(b.chinh);
            else if(!a.ho.equals(b.ho)) return a.ho.compareTo(b.ho);
            else if(!a.dem.equals(b.dem))return a.dem.compareTo(b.dem);
            else return a.ma.compareTo(b.ma);
        });
        for(SV e: A){
            System.out.println(e);
        }
    }
}

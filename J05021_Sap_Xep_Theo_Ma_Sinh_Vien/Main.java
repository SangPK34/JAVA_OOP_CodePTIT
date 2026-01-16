package J05021_Sap_Xep_Theo_Ma_Sinh_Vien;

import java.util.*;

class SV {

    String ma, ten, lop, mail;

    public SV(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + mail;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<SV> A = new ArrayList<>();
        while(sc.hasNextLine()) {
            A.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b) -> {
            
            return a.ma.compareTo(b.ma);
        });
        for (SV e : A) {
            System.out.println(e);
        }
    }
}

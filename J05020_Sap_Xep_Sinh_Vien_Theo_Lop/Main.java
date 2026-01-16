package J05020_Sap_Xep_Sinh_Vien_Theo_Lop;

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
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b) -> {
            if (!a.lop.equals(b.lop)) {
                return a.lop.compareTo(b.lop);
            }
            return a.ma.compareTo(b.ma);
        });
        for (SV e : A) {
            System.out.println(e);
        }
    }
}

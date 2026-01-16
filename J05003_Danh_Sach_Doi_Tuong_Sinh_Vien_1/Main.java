package J05003_Danh_Sach_Doi_Tuong_Sinh_Vien_1;

import java.util.*;

class SV{
    String ma, ten, lop, ns;
    double gpa;

    public SV(int i, String ten, String lop, String ns, double gpa) {
        this.ma = String.format("B20DCCN%03d", i+1);
        this.ten = ten;
        this.lop = lop;
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(1)=='/') sb.insert(0, '0');
        if(sb.charAt(4)=='/') sb.insert(3, '0');
        this.ns = sb.toString();
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n  = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim())));
        }
        for(SV e: A){
            System.out.println(e);
        }
    }
}

package J05075_Diem_Danh_2;

import java.util.*;

class SV{
    String ma, ten, lop, tt;
    int diem;

    public SV(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem = 10;
        this.tt = "";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop +  " " + diem + " " + tt  ;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine() ));
        }
        for(int i =0; i<n; i++){
            String msv = sc.next();
            String s = sc.next();
            for(SV e: A){
                if(e.ma.equals(msv)){
                    for(int j =0; j<s.length(); j++){
                        if(s.charAt(j)=='v') e.diem-=2;
                        else if(s.charAt(j)=='m') e.diem-=1;
                    }
                    if(e.diem<=0) {
                        e.diem=0;
                        e.tt = "KDDK";
                    }
                }
            }
        }
        String lop = sc.next();
        for(SV e: A){
            if(e.lop.equals(lop)) System.out.println(e);
        }
    }
}

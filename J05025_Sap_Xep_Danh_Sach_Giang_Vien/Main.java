package J05025_Sap_Xep_Danh_Sach_Giang_Vien;

import java.util.*;

class GV{
    String ma, ten, mon, vt, name;

    public GV(int i , String ten, String mon) {
        this.ma = String.format("GV%02d", i+1);
        this.ten = ten;
        this.mon = mon;
        String[] A = mon.toUpperCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A) sb.append(w.charAt(0));
        this.vt = sb.toString();
        String[] B = ten.split("\\s+");
        this.name = B[B.length-1];
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + vt;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> A  = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new GV(i, sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b)->{
            if(!a.name.equals(b.name)) return a.name.compareTo(b.name);
            return a.ma.compareTo(b.ma);
        });
        for(GV e: A) {
            System.out.println(e);
        }
    }
}

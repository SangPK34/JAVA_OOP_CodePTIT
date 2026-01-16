package J05027_Tim_Kiem_Giang_Vien;

import java.util.*;

class GV{
    String ma, ten, mon, vtat;

    public GV(int i, String ten, String mon) {
        this.ma = String.format("GV%02d", i+1);
        this.ten = ten;
        this.mon = mon;
        String[] A = mon.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(w.charAt(0));
        }
        this.vtat = sb.toString().toUpperCase();
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + vtat;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new GV(i, sc.nextLine(), sc.nextLine()));
        }
        int k = Integer.parseInt(sc.nextLine());
        while(k-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(GV e: A){
                if(e.ten.toLowerCase().contains(s.toLowerCase())) System.out.println(e);
            }
        }
    }
}

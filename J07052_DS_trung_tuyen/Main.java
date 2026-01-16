package J07052_DS_trung_tuyen;

import java.util.*;
import java.io.*;

class TS{
    String ma, ten;
    Double T, L, H, ut, tong;

    public TS(String ma, String ten, Double T, Double L, Double H) {
        this.ma = ma;
        String[] A = ten.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        this.T = T;
        this.L = L;
        this.H = H;
        if(ma.substring(0, 3).equals("KV1")) this.ut = 0.5;
        if(ma.substring(0, 3).equals("KV2")) this.ut = 1.0;
        if(ma.substring(0, 3).equals("KV3")) this.ut = 2.5;
        this.tong = 2*T+L+H+ut;
    }

    public String rut(double x){
        if(x==(long)x) return String.valueOf((long)x);
        return String.valueOf(x);
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + rut(ut) + " " + rut(tong) ;
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("THISINH.in"));
        ArrayList<TS> A = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i =0; i<n; i++){
            A.add(new TS(sc.nextLine().trim(), sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim())));
        }
        A.sort((a, b) -> {
            if(a.tong!=b.tong) return Double.compare(b.tong, a.tong);
            else return a.ma.compareTo(b.ma);
        });
        int sl = sc.nextInt();
        System.out.printf("%.1f\n",A.get(sl-1).tong);
        for(TS e: A){
            System.out.print(e+" ");
            if(e.tong>=A.get(sl-1).tong) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }
    }
}

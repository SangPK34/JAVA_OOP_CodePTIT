package J07054_Tinh_diem_trung_binh;

import java.util.*;
import java.io.*;

class SV{
    String ma, ten;
    double d1, d2, d3, tb;

    public SV(int i, String ten, double d1, double d2, double d3) {
        this.ma = String.format("SV%02d", i+1);
        String[] A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tb = (3*d1+3*d2+2*d3)/8;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb);
    }
    
    
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner (new File("BANGDIEM.in"));
        ArrayList<SV> A = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i =0; i<n; i++){
            A.add(new SV(i, sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim())));
        }
        A.sort((a, b) -> {
            if(a.tb!=b.tb)return Double.compare(b.tb, a.tb);
            else return a.ma.compareTo(b.ma);
        });
        int x=0;
        for(int i=0; i<n; i++){
            System.out.print(A.get(i)+" ");
            if(i>0 && A.get(i).tb==A.get(x).tb) System.out.println(x+1);
            else{
                System.out.println(i+1);
                x=i;
            }
        }
    }
}

package J07055_xep_loai;
import java.util.*;
import java.io.*;

class SV{
    String ma, ten, tt;
    double d1, d2, d3, tb;

    public SV(int i, String ten, double d1, double d2, double d3) {
        this.ma = String.format("SV%02d", i+1);
        String[] A = ten.toLowerCase().split("\\s+");
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
        this.tb = d1*0.25 + d2*0.35 + d3*0.40;
        
        if(this.tb>=8) tt="GIOI";
        else if(this.tb>=6.5) tt="KHA";
        else if(this.tb>=5) tt="TRUNG BINH";
        else tt="KEM";
        
    }

    @Override
    public String toString() {
        return  ma + " " + ten+ " " + String.format("%.2f", tb) + " " + tt  ;
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SV> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new SV(i, sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim())));
        }
        A.sort((a, b) -> {
            return Double.compare(b.tb, a.tb);
        });
        for(SV e: A){
            System.out.println(e);
        }
    }
}

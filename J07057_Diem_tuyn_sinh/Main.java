package J07057_Diem_tuyn_sinh;
import java.util.*;
import java.io.*;

class TS{
    String ma, ten, kv, dt, tt;
    double diem,congdt, congkv, tong;

    public TS(int i, String ten, double diem,  String dt, String kv) {
        this.ma = String.format("TS%02d", i+1);
        String[] A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        this.kv = kv;
        this.dt = dt;
        this.diem = diem;
        if(!dt.equals("Kinh")) congdt=1.5;
        else congdt = 0;
        if(kv.equals("1")) congkv=1.5;
        else if(kv.equals("2")) congkv = 1;
        else congkv=0;
        this.tong= this.diem + this.congdt + this.congkv;
        if (this.tong < 20.5) tt="Truot";
        else tt= "Do";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", tong) + " " + tt ;
    }
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n= Integer.parseInt(sc.nextLine().trim());
        ArrayList<TS> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new TS(i, sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        A.sort((a, b) -> {
            if(a.tong != b.tong) return Double.compare(b.tong, a.tong);
            else return a.ma.compareTo(b.ma);
        });
        
        for(TS e: A){
            System.out.println(e);
        }
    }
}

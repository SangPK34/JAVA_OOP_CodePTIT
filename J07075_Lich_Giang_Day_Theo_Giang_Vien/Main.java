package J07075_Lich_Giang_Day_Theo_Giang_Vien;

import java.util.*;
import java.io.*;

class MH{
    String ma, ten, tin;

    public MH(String ma, String ten, String tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }
    
}

class GD{
    String ma, thu, kip, gv, phong;

    public GD(String ma, String thu, String kip, String gv, String phong) {
        this.ma = ma;
        this.thu = thu;
        this.kip = kip;
        this.gv = gv;
        this.phong = phong;
    }
    
}


class HP{
    String id, ma, ten, thu, kip, gv, phong;

    public HP(int i, String ma, String ten, String thu, String kip, String gv, String phong) {
        this.id = String.format("HP%03d", i+1);
        this.ma = ma;
        this.ten = ten;
        this.thu = thu;
        this.kip = kip;
        this.gv = gv;
        this.phong = phong;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + thu + " " + kip + " " + phong;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int  n = Integer.parseInt(sc1.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc1.nextLine().trim(), sc1.nextLine(), sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int  m = Integer.parseInt(sc2.nextLine());
        ArrayList<GD> B = new ArrayList<>();
        for(int i =0; i<m; i++){
            B.add(new GD( sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        ArrayList<HP> C = new ArrayList<>();
        for(int i=0; i<m; i++){
            GD e = B.get(i);
            for(MH f: A){
                if(e.ma.equals(f.ma)){
                    C.add(new HP(i, f.ma, f.ten, e.thu, e.kip, e.gv, e.phong));
                    break;
                }
            }
        }
        C.sort((a, b)->{
            if(!a.thu.equals(b.thu)) return a.thu.compareTo(b.thu);
            else if(!a.kip.equals(b.kip)) return Integer.parseInt(a.kip)-Integer.parseInt(b.kip);
            return a.gv.compareTo(b.gv);
        });
        String x = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN "+x+":");
        for(HP e: C){
            if(e.gv.equals(x)) System.out.println(e);
        }
    }
}

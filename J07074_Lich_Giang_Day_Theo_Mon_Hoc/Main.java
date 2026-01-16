package J07074_Lich_Giang_Day_Theo_Mon_Hoc;
import java.util.*;
import java.io.*;

class MH{
    String ma, ten;
    int tin;

    public MH(String ma, String ten, int tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }
}


class Lich{
    String ma, thu, kip, tengv, phong;

    public Lich(String ma, String thu, String kip, String tengv, String phong) {
        this.ma = ma;
        this.thu = thu;
        this.kip = kip;
        this.tengv = tengv;
        this.phong = phong;
    }
    
}


class HP{
    String id, ma, thu, kip, tengv, phong;

    public HP(int i, String ma, String thu, String kip, String tengv, String phong) {
        this.id = String.format("HP%03d", i+1);
        this.ma = ma;
        this.thu = thu;
        this.kip = kip;
        this.tengv = tengv;
        this.phong = phong;
    }

    @Override
    public String toString() {
        return id + " " + thu + " " + kip + " " + tengv + " " + phong;
    }
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<MH> mh = new ArrayList<>();
        for(int i =0; i<n; i++){
            mh.add(new MH(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine())));
        }
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<Lich> gd = new ArrayList<>();
        for(int i =0; i<m; i++){
            gd.add(new Lich(sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        ArrayList<HP> hp = new ArrayList<>();
        for(int i =0; i<m;i++){
            for(MH e: mh){
                if(e.ma.equals(gd.get(i).ma)){
                    hp.add(new HP(i, gd.get(i).ma, gd.get(i).thu, gd.get(i).kip, gd.get(i).tengv, gd.get(i).phong ));
                    break;
                }
            }
        }
        hp.sort((a, b)->{
            if(!a.thu.equals(b.thu)) return a.thu.compareTo(b.thu);
            else if(!a.kip.equals(b.kip)) return Integer.parseInt(a.kip)-Integer.parseInt(b.kip);
            else return a.tengv.compareTo(b.tengv);
        });
        String x = sc2.nextLine();
        System.out.print("LICH GIANG DAY MON ");
        for(MH e: mh){
            if(e.ma.equals(x)) {
                System.out.println(e.ten+":");
                break;
            }
        }
        for(HP e: hp){
            if(e.ma.equals(x)) {
                System.out.println(e);
            }
        }
    }
}

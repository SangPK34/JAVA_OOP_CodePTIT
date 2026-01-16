package J06009_Bai_toan_ban_hang;

import java.io.*;
import java.util.*;

class KH{
    String ma, ten, gt, ns, dc;

    public KH(int i, String ten, String gt, String ns, String dc) {
        this.ma = String.format("KH%03d", i+1);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    @Override
    public String toString() {
        return ten + " " + dc ;
    }
    
    
}

class MH{
    String ma, ten, dvi;
    int mua, ban, loi;

    public MH(int i, String ten, String dvi, int mua, int ban) {
        this.ma = String.format("MH%03d", i+1);
        this.ten = ten;
        this.dvi = dvi;
        this.mua = mua;
        this.ban = ban;
        this.loi= ban-mua;
    }

    @Override
    public String toString() {
        return ten + " " + dvi + " " + mua + " " + ban;
    }
    
    
}


class HD{
    String ma, mkh, mmh;
    int sl;

    public HD(int i, String s) {
        this.ma =String.format("HD%03d", i+1);
        String[] A = s.trim().split("\\s+");
        
        this.mkh = A[0];
        this.mmh = A[1];
        this.sl = Integer.parseInt(A[2]);
    }

    @Override
    public String toString() {
        return ma;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("KH.in"));
        ArrayList<KH> A1= new ArrayList<>();
        ArrayList<MH> A2= new ArrayList<>();
        ArrayList<HD> A3= new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i=0; i<n; i++){
            A1.add(new KH(i, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        sc1.close();
        
        Scanner sc2 = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(sc2.nextLine());
        for(int i=0; i<m; i++){
            A2.add(new MH(i, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }
        sc2.close();
        
        Scanner sc3 = new Scanner(new File("HD.in"));
        int k = Integer.parseInt(sc3.nextLine());
        for(int i=0; i<k; i++){
            A3.add(new HD(i, sc3.nextLine()));
        }
        sc3.close();
        
        for(HD e: A3){
            System.out.print(e+" ");
            int x= Integer.parseInt(e.mkh.substring(2));
            int y= Integer.parseInt(e.mmh.substring(2));
            System.out.println(A1.get(x-1)+" "+A2.get(y-1)+" "+e.sl+" "+A2.get(y-1).ban*e.sl);
            
        }
    }
}

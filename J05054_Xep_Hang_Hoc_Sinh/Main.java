package J05054_Xep_Hang_Hoc_Sinh;

import java.util.*;

class HS{
    String ma,ten,tt;
    double tb;
    int rank;

    public HS(int i, String ten, double tb) {
        this.ma = String.format("HS%02d", i+1);
        this.ten = ten;
        this.tb = tb;
        if(tb<5) tt= "Yeu";
        else if(tb<7) tt= "Trung Binh";
        else if(tb<9) tt= "Kha";
        else tt= "Gioi";
        rank=0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tb + " " + tt + " " + rank;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HS> A =new ArrayList<>();
        ArrayList<String> msv = new ArrayList<>();
        for(int i=0; i<n; i++){
            HS e = new HS(i, sc.nextLine(), Double.parseDouble(sc.nextLine()));
            A.add(e);
            msv.add(e.ma);
        }
        A.sort((a, b)->{
            return Double.compare(b.tb, a.tb);
        });
        A.get(0).rank = 1;
        double max = A.get(0).tb;
        for(int i=1; i<n; i++){
            if(A.get(i).tb<max){
                max = A.get(i).tb;
                A.get(i).rank = i+1;
            }
            else{
                A.get(i).rank = A.get(i-1).rank;
            }
        }
        for(String m: msv){
            for(HS e: A) if(e.ma.equals(m))System.out.println(e);
        }
    }
}
//5
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Nguyen Bao Trung
//8.6
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
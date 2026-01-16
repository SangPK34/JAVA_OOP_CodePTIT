package J07058_DS_mon_thi;

import java.util.*;
import java.io.*;
class MH{
    String ma, ten, ht;

    public MH(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ht;
    }

}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b)->{
            return a.ma.compareTo(b.ma);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
    
}

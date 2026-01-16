package J07048_DS_San_pham_2;

import java.util.*;
import java.io.*;

class SP{
    String ma, ten;
    int gia, bh;

    public SP(String ma, String ten, int gia, int bh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + bh;
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SP> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new SP(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        A.sort((a, b) -> {
            if(a.gia!=b.gia) return b.gia-a.gia;
            else return a.ma.compareTo(b.ma);
        });
        for(SP e: A){
            System.out.println(e);
        }
    }
}

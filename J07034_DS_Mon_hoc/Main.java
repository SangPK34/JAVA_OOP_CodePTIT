package J07034_DS_Mon_hoc;

import java.util.*;
import java.io.*;

class MH{
    String ma, ten;
    int tc;

    public MH(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tc ;
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        A.sort((a, b) ->{
            return a.ten.compareTo(b.ten);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}

package J07019_Hoa_Don_1;

import java.util.*;
import java.io.*;

class MH{
    String ma, ten;
    long gia1, gia2;

    public MH(String ma, String ten, long gia1, long gia2) {
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    
}

class HD{
    String id, ma, ten;
    long gia, sl, tong, giam, con;

    public HD(int i, String ma, String ten, long gia, long sl) {
        this.ma = ma;
        this.id = String.format(ma+"-%03d", i+1);
        this.ten = ten;
        this.gia = gia;
        this.sl = sl;
        this.tong = gia*sl;
        if(sl>=150) giam = tong*5/10;
        else if(sl>=150) giam = tong*5/10;
        else if(sl>=100) giam = tong*3/10;
        else if(sl>=50) giam = tong*15/100;
        else giam =0;
        this.con = tong-giam;
    }

    @Override
    public String toString() {
        return  id + " " + ten + " " + giam + " " + con;
    }

    
    
}


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<MH> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine())));
        }
        
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<HD> B = new ArrayList<>();
        for(int i=0; i<m; i++){
            String s = sc2.nextLine();
            String[] a = s.split("\\s+");
            String ma = a[0].substring(0, 2);
            String loai = a[0].substring(2);
            long sl = Long.parseLong(a[1]), gia=0;
            for(MH e: A){
                if(ma.equals(e.ma)){
                    if(loai.equals("1")) gia = e.gia1;
                    else gia = e.gia2;
                    B.add(new HD(i, a[0], e.ten ,gia, sl));
                    break;
                }
            }
        }
        for(HD e: B){
            System.out.println(e);
        }
    }
}

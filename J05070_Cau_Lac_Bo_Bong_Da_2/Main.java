package J05070_Cau_Lac_Bo_Bong_Da_2;

import java.util.*;

class CLB{
    String ma, ten;
    long gia;

    public CLB(String ma, String ten, long gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
}

class Tran{
    String matran,ma, ten;
    long sl, gia, tong;

    public Tran(String s) {
        String[]A = s.split("\\s+");
        matran=A[0];
        this.ma = A[0].substring(1, 3);
        this.sl = Long.parseLong(A[1]);
    }

    @Override
    public String toString() {
        return  matran + " " + ten + " " + tong ;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<Tran> B = new ArrayList<>();
        for(int i=0; i<k; i++){
            Tran e = new Tran(sc.nextLine());
            for(CLB f: A){
                if(e.ma.equals(f.ma)) {
                    e.ten = f.ten;
                    e.gia=f.gia;
                    e.tong=e.sl*e.gia;
                    break;
                }
            }
            B.add(e);
        }
        B.sort((a, b)->{
            if(a.tong !=b.tong) return Long.compare(b.tong, a.tong);
            return a.ten.compareTo(b.ten);
        });
        for(Tran e: B){
            System.out.println(e);
        }
    }
}

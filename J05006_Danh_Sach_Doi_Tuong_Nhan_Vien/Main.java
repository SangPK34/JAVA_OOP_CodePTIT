package J05006_Danh_Sach_Doi_Tuong_Nhan_Vien;

import java.util.*;

class NV{
    String ma, ten , gt, ns, dc, mst, date;

    public NV(int i, String ten, String gt, String ns, String dc, String mst, String date) {
        this.ma = String.format("%05d", i+1);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.date = date;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + date;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new NV(i, sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(NV e: A){
            System.out.println(e);
        }
    }
}

package J05029_Danh_Sach_Doanh_Nghiep_Nhan_Sinh_Vien_Thuc_Tap_2;

import java.util.*;

class DN{
    String ma, ten;
    int sl;

    public DN(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sl;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DN> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        A.sort((a, b)->{
            if(a.sl!=b.sl) return b.sl-a.sl;
            return a.ma.compareTo(b.ma);
        });
        int k = Integer.parseInt(sc.nextLine());
        while(k-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " +  a +" DEN "+ b +" SINH VIEN:");
            for(DN e: A){
                if(e.sl>=a && e.sl <=b) System.out.println(e);
            }
            sc.nextLine();
        }
    }
    
}

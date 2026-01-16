package J05028_Danh_Sach_Doanh_Nghiep_Nhan_Sinh_Vien_Thuc_Tap_1;

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
        for(DN e: A){
            System.out.println(e);
        }
    }
    
}

package J05030_Bang_Diem_Thanh_Phan_1;
import java.util.*;

class SV{
    String ma, ten, lop;
    double d1, d2, d3;

    public SV(String ma, String ten, String lop, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            SV e = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            A.add(e);
        }
        A.sort((a, b)->{
            return a.ma.compareTo(b.ma);
        });
        int i =0;
        for(SV e: A) {
            
            System.out.println(i+1+" "+e);
            i++;
        }
    }
}

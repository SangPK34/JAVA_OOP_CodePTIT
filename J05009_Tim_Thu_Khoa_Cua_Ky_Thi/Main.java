package J05009_Tim_Thu_Khoa_Cua_Ky_Thi;

import java.util.*;

class TS{
    int ma;
    String ten, ns;
    double d1, d2, d3, tong;

    public TS(int i, String ten, String ns, double d1, double d2, double d3) {
        this.ma = i+1;
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1+d2+d3;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + ns + " " + tong;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TS> A= new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new TS(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        A.sort((a, b) ->{
            return Double.compare(b.tong, a.tong);
        });
        double max = A.get(0).tong;
        for(TS e: A){
            if(e.tong==max) System.out.println(e);
        }
    }
}

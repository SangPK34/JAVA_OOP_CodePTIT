package J05049_Liet_Ke_Nhap_Xuat_Hang_Theo_Nhom;
import java.util.*;

class MH{
    String ma;
    double  dgia, xuat, nhap, tien, thue;

    public MH(String ma, double nhap) {
        this.ma = ma;
        this.nhap = nhap;
        int n = ma.length();
        if(ma.charAt(n-1)=='Y') dgia = 110000;
        else if(ma.charAt(n-1)=='N') dgia = 135000;
        if(ma.charAt(0)=='A') xuat = Math.round(nhap*0.6);
        else if(ma.charAt(0)=='B') xuat = Math.round(nhap*0.7);
        tien = xuat*dgia;
        if(ma.charAt(0)=='A' && ma.charAt(n-1)=='Y') thue = Math.round(tien*0.08);
        else if(ma.charAt(0)=='A' && ma.charAt(n-1)=='N') thue = Math.round(tien*0.11);
        else if(ma.charAt(0)=='B' && ma.charAt(n-1)=='Y') thue = Math.round(tien*0.17);
        else if(ma.charAt(0)=='B' && ma.charAt(n-1)=='N') thue = Math.round(tien*0.22);
    }

    @Override
    public String toString() {
        return ma+ " "+ String.format("%.0f", nhap)+" "+  String.format("%.0f", xuat) + " "  +  String.format("%.0f", dgia)  + " " +  String.format("%.0f", tien) + " " +  String.format("%.0f", thue);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH>A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new MH(sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        A.sort((a, b)->{
            return Double.compare(b.thue, a.thue);
        });
        String x = sc.nextLine();
        for(MH e: A){
            if(e.ma.charAt(0)==x.charAt(0))System.out.println(e);
        }
    }
}

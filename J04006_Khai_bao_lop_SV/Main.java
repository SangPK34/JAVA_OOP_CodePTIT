package J04006_Khai_bao_lop_SV;

import java.util.*;
class SV{
    String ten, msv, ns;
    float diem;

    public SV(String ten,String msv,String ns,float diem){
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(2)!='/') sb.insert(0, '0');
        if(sb.charAt(5)!='/') sb.insert(3, '0');
        ns = sb.toString();
        this.ten=ten;
        this.msv= msv;
        this.ns= ns;
        this.diem=diem;
    }
    
    public void xuat(){
        System.out.print("B20DCCN001 ");
        System.out.print(ten + " "+ msv +" " + ns + " ");
        System.out.printf("%.2f", diem);
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten=sc.nextLine(), msv= sc.next(), ns=sc.next();
        float diem=sc.nextFloat();
        SV sv1= new SV(ten, msv, ns, diem);
        sv1.xuat();
    }
}

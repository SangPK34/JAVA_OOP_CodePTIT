package J04007_Khai_bao_lop_NV;

import java.util.*;
class NV{
    String mnv="00001", ten, gt, ns, dc, sdt, dky;
    
    public NV(String ten, String gt, String ns, String dc, String sdt, String dky){
        this.ten=ten;
        this.dc=dc;
        this.gt=gt;
        this.ns=ns;
        this.sdt=sdt;
        this.dky=dky;
    }
    
    public void xuat(){
        System.out.printf("%s %s %s %s %s %s %s", mnv, ten, gt, ns, dc, sdt, dky);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten= sc.nextLine(), gt = sc.nextLine(), ns = sc.nextLine(), dc= sc.nextLine(), sdt= sc.nextLine(), dky=sc.nextLine();
        NV nv1 = new NV(ten, gt, ns, dc, sdt, dky);
        nv1.xuat();
    }
}

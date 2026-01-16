package J04005_Khai_bao_lop_thi_sinh;

import java.util.Scanner;

class SV {

    String ten;
    String ns;
    float d1, d2, d3, tong;

    public SV(String ten, String ns, float d1, float d2, float d3) {
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1 + d2 + d3;
    }

    public void xuat() {
        System.out.println(ten + " " + ns + " " + tong);
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ns = sc.next();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();
        SV sv1 = new SV(ten, ns, d1, d2, d3);
        sv1.xuat();
        sc.close();
    }
}

package J01003_Phuong_trinh_bac_nhat;

import java.util.*;

public class Main {

    static void check(double a, double b) {
        if (a == 0 && b == 0) {
            System.out.println("VSN");
        }
        if (a == 0 && b != 0) {
            System.out.println("VN");
        }
        if (a != 0) {
            System.out.printf("%.2f", -b / a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        check(a, b);
    }

}

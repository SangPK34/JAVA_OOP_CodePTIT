package J04001_Khai_bao_lop_point;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static class point {

        double x, y;

        public void get() {
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
    }

    static double dis(point a, point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            point a = new point();
            point b = new point();
            a.get();
            b.get();
            System.out.printf("%.4f\n", dis(a, b));
        }
    }
}

package J04008_Chu_vi_tam_giac;

import java.util.*;

class Point {

    private double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public static void chuvi(Point p1, Point p2, Point p3) {
        if ((p2.x - p1.x) * (p3.y - p1.y) - (p2.y - p1.y) * (p3.x - p1.x) == 0) {
            System.out.println("INVALID");
            return;
        }
        double d1 = distance(p1, p2);
        double d2 = distance(p2, p3);
        double d3 = distance(p3, p1);
        System.out.printf("%.3f\n", d1 + d2 + d3);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            Point.chuvi(p1, p2, p3);
        }
    }
}

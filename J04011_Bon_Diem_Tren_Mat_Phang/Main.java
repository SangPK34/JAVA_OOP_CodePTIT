package J04011_Bon_Diem_Tren_Mat_Phang;

import java.util.*;

class Point3D {
    int x, y, z;

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    static long[] vec(Point3D a, Point3D b){
        return new long[]{
            b.x - a.x,
            b.y - a.y,
            b.z - a.z
        };
    }

    static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        long[] AB = vec(p1, p2);
        long[] AC = vec(p1, p3);
        long[] AD = vec(p1, p4);

        long cx = AB[1] * AC[2] - AB[2] * AC[1];
        long cy = AB[2] * AC[0] - AB[0] * AC[2];
        long cz = AB[0] * AC[1] - AB[1] * AC[0];

        long triple = cx * AD[0] + cy * AD[1] + cz * AD[2];

        return triple == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if(Point3D.check(p1, p2, p3, p4)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

package J04009_Dien_Tich_Tam_Giac;

import java.util.*;

class P{
    double x, y;

    public P(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
}

public class Main {
    static double distance(P P1,P P2){
        return Math.sqrt((P1.x-P2.x)*(P1.x-P2.x) + (P1.y-P2.y)*(P1.y-P2.y));
    }
    
    static String S(P p1, P p2, P p3){
        double a = distance(p1, p2);
        double b = distance(p2, p3);
        double c = distance(p1, p3);
        if(a + b <= c || a + c <= b || b + c <= a) return "INVALID";

        return String.format("%.2f", (double)1/4*Math.sqrt((a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c)));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            P p1 = new P(sc.nextDouble(), sc.nextDouble());
            P p2 = new P(sc.nextDouble(), sc.nextDouble());
            P p3 = new P(sc.nextDouble(), sc.nextDouble());
            System.out.println(S(p1, p2, p3));
        }
    }
}

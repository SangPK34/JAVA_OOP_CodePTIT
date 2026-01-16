package J04013_Bai_Toan_Tuyen_Sinh;

import java.util.*;
public class Main {
    static String tron(double x){
        if(x==(long) x) return String.valueOf((long)x);
        else return String.valueOf( x);
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double t = sc.nextDouble();
        double l = sc.nextDouble();
        double h = sc.nextDouble();
        double cong = 0;
        if(ma.substring(0, 3).equals("KV1")) cong = 0.5;
        else if(ma.substring(0, 3).equals("KV2"))cong = 1.0;
        else cong = 2.5;
        double diem = t*2 + l + h, tong = diem+cong;
        System.out.print(ma+" "+ten+" "+tron(cong)+" "+ tron(diem)+" ");
        if(tong>=24) System.out.println("TRUNG TUYEN");
        else System.out.println("TRUOT");
    }
}

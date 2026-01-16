package J05077_Tinh_Luong;
import java.util.*;

class PB {

    String ma, ten;

    public PB(String s) {
        String[] A = s.split("\\s+");
        this.ma = A[0];
        this.ten = String.join(" ", Arrays.copyOfRange(A, 1, A.length));
    }

}

class NV {

    String ma, ten;
    long lcb, ngay, heso, tong;

    public NV(String ma, String ten, long lcb, long ngay) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
        this.ngay = ngay;
        long x = Long.parseLong(ma.substring(1, 3));
        if (ma.charAt(0) == 'A') {
            if (1 <= x && x <= 3) {
                this.heso = 10;
            } else if (4 <= x && x <= 8) {
                this.heso = 12;
            } else if (9 <= x && x <= 15) {
                this.heso = 14;
            } else if (16 <= x) {
                this.heso = 20;
            }
        } else if (ma.charAt(0) == 'B') {
            if (1 <= x && x <= 3) {
                this.heso = 10;
            } else if (4 <= x && x <= 8) {
                this.heso = 11;
            } else if (9 <= x && x <= 15) {
                this.heso = 13;
            } else if (16 <= x) {
                this.heso = 16;
            }
        } else if (ma.charAt(0) == 'C') {
            if (1 <= x && x <= 3) {
                this.heso = 9;
            } else if (4 <= x && x <= 8) {
                this.heso = 10;
            } else if (9 <= x && x <= 15) {
                this.heso = 12;
            } else if (16 <= x) {
                this.heso = 14;
            }
        } else if (ma.charAt(0) == 'D') {
            if (1 <= x && x <= 3) {
                this.heso = 8;
            } else if (4 <= x && x <= 8) {
                this.heso = 9;
            } else if (9 <= x && x <= 15) {
                this.heso = 11;
            } else if (16 <= x) {
                this.heso = 13;
            }
        }
        this.tong = (long) this.lcb * this.ngay * this.heso * 1000;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<PB> phong = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            phong.add(new PB(sc.nextLine()));
        }
        ArrayList<NV> A = new ArrayList<>();
        int k = Integer.parseInt(sc.nextLine());
        for(int i =0; i<k; i++){
            A.add(new NV(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        for( NV e: A){
            System.out.print(e.ma+" "+ e.ten+" ");
            for(PB f: phong){
                if(f.ma.equals(e.ma.substring(3))) System.out.print(f.ten+" ");
            }
            System.out.println(e.tong);
        }
    }
}

package J05053_Sap_Xep_Don_Hang;
import java.util.*;

class MH{
    String ten, ma, dau, stt, loai;
    long dgia, sl, gg, ttien;

    public MH(String ten, String ma, long dgia, long sl) {
        this.ten=ten;
        this.ma = ma;
        this.dgia = dgia;
        this.sl = sl;
        dau = ma.substring(0, 0);
        stt = ma.substring(1, 4);
        loai = ma.substring(4);
        if(loai.equals("1")) gg= dgia*sl/2;
        else gg = dgia*sl *30/100;
        ttien = dgia*sl-gg;
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + stt + " " + gg + " " + ttien;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A =new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new MH(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        A.sort((a, b)->{
            return Integer.parseInt(a.stt)-Integer.parseInt(b.stt);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}

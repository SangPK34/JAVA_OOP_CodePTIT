package J05035_Danh_Sach_Thuc_Tap_2;
import java.util.*;

class SV{
    int stt;
    String ma, ten, lop, mail, dn;

    public SV(int stt, String ma, String ten, String lop, String mail, String dn) {
        this.stt = stt+1;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.dn = dn;
    }

    @Override
    public String toString() {
        return stt + " " + ma + " " + ten + " " + lop + " " + mail + " " + dn;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        A.sort((a, b)->{
            return a.ma.compareTo(b.ma);
        });
        int k = Integer.parseInt(sc.nextLine());
        while(k-->0){
            String x  = sc.nextLine();
            for(SV e: A){
                if(e.dn.equals(x)) System.out.println(e);
            }
        }
    }
}

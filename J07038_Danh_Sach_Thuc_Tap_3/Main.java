package J07038_Danh_Sach_Thuc_Tap_3;

import java.util.*;
import java.io.*;

class SV{
    String ma, ten, lop, mail;

    public SV(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        String[] A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        this.lop = lop;
        this.mail = mail;
    }
}

class DN{
    String ma, ten;
    long sl;

    public DN(String ma, String ten, long sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }
}

class TT{
    String msv, ten, lop, mdn, dn;

    public TT(String msv, String ten, String lop, String mdn, String dn) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mdn = mdn;
        this.dn = dn;
    }
    @Override
    public String toString() {
        return  msv + " " + ten + " " + lop;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));        
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new SV(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<DN> B  = new ArrayList<>();
        for(int i=0; i<m; i++){
            B.add(new DN(sc2.nextLine(), sc2.nextLine(), Long.parseLong(sc2.nextLine())));
        }
        
        ArrayList<TT> C = new ArrayList<>();
        int k = Integer.parseInt(sc3.nextLine());
        for(int i =0; i<k; i++){
            String s = sc3.nextLine();
            String a[] = s.split("\\s+");
            for(SV e: A){
                if(a[0].equals(e.ma)) for(DN f: B){
                    if(a[1].equals(f.ma)){
                        C.add(new TT(e.ma, e.ten, e.lop, f.ma, f.ten));
                        break;
                    }
                }
                break;
            }
        }
        C.sort((a, b)->{
            return a.msv.compareTo(b.msv);
        });
        int l = Integer.parseInt(sc3.nextLine());
        while(l-->0){
            String x = sc3.nextLine();
            long sl=0;
            System.out.print("DANH SACH THUC TAP TAI ");
            for(DN e: B){
                if(e.ma.equals(x)) {
                    System.out.println(e.ten+":");
                    sl=e.sl;
                }
            }
            int cnt=0;
            for(TT e: C){
                if(e.mdn.equals(x)&&cnt<sl) {
                    System.out.println(e);
                    cnt++;
                }
            }
        }
    }
}

package J05047_Bang_Ke_Nhap_Kho_Sap_Xep_Theo_Chiet_Khau;

import java.util.*;

class MH{
    String ma, ten;
    long sl, dgia, ck, ttien;
    

    public MH( String ten, long sl, long dgia) {
        String[] A = ten.split("\\s+");
        this.ma = String.valueOf(Character.toUpperCase(A[0].charAt(0)))+String.valueOf(Character.toUpperCase(A[1].charAt(0)));
        this.ten = ten;
        this.sl = sl;
        this.dgia = dgia;
        if(sl <5) ck = 0;
        else if(sl <8) ck = dgia*sl*1/100;
        else if(sl <=10) ck = dgia*sl*2/100;
        else ck = dgia*sl*5/100;
        ttien = dgia*sl-ck;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + ck + " " + ttien ;
    }
        
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> A =new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        for(int i =0; i<n; i++){
            MH e = new MH(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            int k= mp.getOrDefault(e.ma, 0)+1;
            mp.put(e.ma, k);
            e.ma= String.format(e.ma+"%02d", k);
            A.add(e);
        }
        A.sort((a, b)->{
            return Long.compare(b.ck, a.ck);
        });
        for(MH e: A){
            System.out.println(e);
        }
    }
}
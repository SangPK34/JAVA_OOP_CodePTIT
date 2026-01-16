package J07045_Loai_phong;

import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    String KH, loai, gia, pv;

    public LoaiPhong(String s) {
        String[] A = s.split("\\s+");
        this.KH = A[0];
        this.loai = A[1];
        this.gia = A[2];
        this.pv = A[3];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.loai.compareTo(o.loai);
    }

    @Override
    public String toString() {
        return KH + " " + loai + " " + gia + " " + pv;
    }
    
}

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

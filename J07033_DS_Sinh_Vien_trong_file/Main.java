package J07033_DS_Sinh_Vien_trong_file;

import java.util.*;
import java.io.*;

class SV{
    String ma, ten, lop, email;

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.email = email;
    }

    public String chuanhoa(String s){
        String[] A = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1)+" ");
            else sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email ;
    }
    
    
}


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n= Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        A.sort((a, b)->{
            return a.ma.compareTo(b.ma);
        });
        A.forEach(e ->{
            System.out.println(e);
        });
    }
}

package J07072_Chuan_hoa_va_sap_xep;

import java.util.*;
import java.io.*;

class Name{
    String ten, ho, dem, chinh;

    public Name(String ten) {
        String[]A = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w: A){
            sb.append(Character.toUpperCase(w.charAt(0)));
            if(w.length()>1) sb.append(w.substring(1));
            sb.append(" ");
        }
        this.ten = sb.toString().trim();
        this.chinh =A[A.length-1];
        this.ho = A[0];
        this.dem = String.join(" ", Arrays.copyOfRange(A, 1, A.length-1));
    }

    @Override
    public String toString() {
        return ten;
    }
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner (new File("DANHSACH.in"));
        ArrayList<Name> A =new ArrayList<>();
        
        while(sc.hasNext()){
            A.add(new Name(sc.nextLine()));
        }
        A.sort((a, b) -> {
            if(!a.chinh.equals(b.chinh)) return a.chinh.compareTo(b.chinh);
            else if(!a.ho.equals(b.ho)) return a.ho.compareTo(b.ho);
            else return a.dem.compareTo(b.dem);
        });
        for(Name e: A){
            System.out.println(e);
        }
    }
}

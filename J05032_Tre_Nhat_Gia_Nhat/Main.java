package J05032_Tre_Nhat_Gia_Nhat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class P{
    String ten, ns;
    long tuoi;

    public P(String ten, String ns) {
        this.ten = ten;
        this.ns = ns;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s2 = "01/01/0001";
        LocalDate d1 = LocalDate.parse(ns, f);
        LocalDate d2 = LocalDate.parse(s2, f);
        this.tuoi = ChronoUnit.DAYS.between(d1, d2);
    }

    @Override
    public String toString() {
        return ten;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<P> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new P(sc.next(), sc.next()));
            sc.nextLine();
        }
        A.sort((a, b) ->{
            return Long.compare(a.tuoi, b.tuoi);
         });
        System.out.println(A.get(0));
        System.out.println(A.get(A.size()- 1));
       
    }
}

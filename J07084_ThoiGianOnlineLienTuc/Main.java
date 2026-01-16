package J07084_ThoiGianOnlineLienTuc;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class SV{
    String ten, time1, time2;
    int phut;

    public SV(String ten, String time1, String time2) {
        this.ten = ten;
        this.time1 = time1;
        this.time2 = time2;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime D1 = LocalDateTime.parse(time1, f);
        LocalDateTime D2 = LocalDateTime.parse(time2, f);
        long kc = ChronoUnit.MINUTES.between(D1, D2);

        this.phut =(int)kc;
        
    }
    @Override
    public String toString() {
        return ten + " " + phut;
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc =new Scanner (new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        A.sort((a, b) -> {
            if(a.phut != b.phut) return b.phut- a.phut;
            else return a.ten.compareTo(b.ten);
        });
        for(SV e: A){
            System.out.println(e);
        }
    }
}

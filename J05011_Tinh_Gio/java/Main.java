package J05011_Tinh_Gio.java;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Net{
    String ma, ten, vao, ra;
    long kc, gio, phut;

    public Net(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime h1 = LocalTime.parse(vao, f);
        LocalTime h2 = LocalTime.parse(ra, f);
        this.kc = ChronoUnit.MINUTES.between(h1, h2);
        this.gio = kc/60;
        this.phut = kc%60;
    }

    @Override
    public String toString() {
        return ma + "  " + ten + " " + gio + " gio " + phut +" phut";
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        ArrayList<Net> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new Net(sc.nextLine().trim(), sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim()));
        }
        A.sort((a, b) -> {
            return Long.compare(b.kc, a.kc);
        });
        for(Net e: A){
            System.out.println(e);
        }
    }
}

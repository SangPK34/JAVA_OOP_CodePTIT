package J05042_Bang_Xep_Hang;

import java.util.*;

class SV{
    String ten;
    long ac, sub;

    public SV(String ten, long ac, long sub) {
        this.ten = ten;
        this.ac = ac;
        this.sub = sub;
    }

    @Override
    public String toString() {
        return ten + " " + ac + " " + sub;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(sc.nextLine(), sc.nextLong(), sc.nextLong()));
            sc.nextLine();
        }
        A.sort((a, b)->{
            if(a.ac==b.ac && a.sub == b.sub) return a.ten.compareTo(b.ten);
            if(a.ac != b.ac) return Long.compare(b.ac, a.ac);
            return Long.compare(a.sub, b.sub);
        });
        for(SV e: A){
            System.out.println(e);
        }
    }
}

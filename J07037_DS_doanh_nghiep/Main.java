package J07037_DS_doanh_nghiep;
import java.util.*;
import java.io.*;
class DN{
    String ma, ten;
    int sl;

    public DN(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sl;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DN> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        A.sort((a,b) -> {
            return a.ma.compareTo(b.ma);
        });
        for(DN e: A){
            System.out.println(e);
        }
    }
}

package J05023_Liet_Ke_Sinh_Vien_Theo_Khoa;

import java.util.*;

class SV{
    String ma, ten , lop, mail;

    public SV(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + mail;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SV> A = new ArrayList<>();
        for(int i =0; i<n; i++){
            A.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine() ));
        }
      //  int k  = Integer.parseInt(sc.nextLine().trim());
      int k = sc.nextInt();
        for(int i =0; i<k; i++){
            String s = sc.next();
      //      System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
      System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", s);
            A.forEach(e -> {
                if(e.ma.substring(1, 3).compareTo(s.substring(2)) == 0) System.out.println(e);
            });
        }
    }
}

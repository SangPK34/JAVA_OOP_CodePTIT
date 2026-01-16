package J05069_Cau_Lac_Bo_Bong_Da_1;

import java.util.*;

class C{
    String ma, ten;
    long gia;

    public C(String ma, String ten, long gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return  ma + " " + ten;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<C> A = new ArrayList<>();
                
        for(int i =0; i<n; i++){
            A.add(new C(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        int k=sc.nextInt();
        while(k-->0){
            String s = sc.next();
            long sl = sc.nextLong();
            for(C e: A){
                if(s.substring(1, 3).equals(e.ma)) System.out.println(s+" "+e.ten+" "+e.gia*sl);
            }
        }
    }
    
}

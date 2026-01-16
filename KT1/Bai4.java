package KT1;

import java.util.*;

public class Bai4 {

    static class sv {
        String msv, ten, sdt;
        int id;
        
        public sv(String m, String n, String s, int i) {
            msv = m;
            ten = n;
            sdt = s;
            id = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<sv> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new sv(sc.nextLine(), sc.nextLine(), sc.next(), sc.nextInt()));
        }
        a.sort((sv x, sv y) -> {
            return x.msv.compareTo(y.msv);
        });
        String[] A = new String[m + 1];
        sc.nextLine();
        for (int i = 1; i <= m; i++)
            A[i] = sc.nextLine();
        a.forEach(e -> {
            System.out.printf("%s %s %s %d %s\n", e.msv, e.ten, e.sdt, e.id, A[e.id]);
        });
    }
}

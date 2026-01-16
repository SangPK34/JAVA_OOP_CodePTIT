package J03010_Dia_chi_email_ptit;
import java.util.*;

public class Main {

    static String mail(String s) {
        s = s.trim().toLowerCase();
        String[] A = s.split("\\s+");
        String ten = A[A.length - 1];
        StringBuilder r = new StringBuilder(ten);
        for (int i = 0; i < A.length - 1; i++) {
            r.append(A[i].charAt(0));
        }
        return r.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> mp = new HashMap<>();

        while (t-- > 0) {
            String s = sc.nextLine().trim();
            if (s.isEmpty()) { 
                t++; 
                continue; 
            }

            String base = mail(s);
            mp.put(base, mp.getOrDefault(base, 0) + 1);
            int k = mp.get(base);

            if (k == 1) 
                System.out.println(base + "@ptit.edu.vn");
            else 
                System.out.println(base + k + "@ptit.edu.vn");
        }
    }
}

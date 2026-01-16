package J01002_Tong_N_so_dau_tien;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long cnt = n * (n + 1) / 2;
            System.out.println(cnt);
        }
    }
}

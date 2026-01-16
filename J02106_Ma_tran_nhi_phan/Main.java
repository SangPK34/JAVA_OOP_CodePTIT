package J02106_Ma_tran_nhi_phan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                if (x == 1) dem++;

            }
            if (dem >= 2) cnt++;
        }
        System.out.println(cnt);
    }
}

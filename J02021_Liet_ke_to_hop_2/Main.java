package J02021_Liet_ke_to_hop_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = i + 1;
        }
        int x = 1 << n;
        int cnt =0;
        for (int mask = x - 1; mask >= 0; mask--) {
            if (Integer.bitCount(mask) == k) {
                cnt++;
                for (int i = n; i >= 0; i--) {
                    if ((mask & (1 << i)) != 0) {
                        System.out.print(A[n-1-i]);
                    }
                }
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Tong cong co "+ cnt +" to hop");
        sc.close();
    }

}

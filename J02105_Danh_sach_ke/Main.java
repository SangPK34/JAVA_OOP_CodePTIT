package J02105_Danh_sach_ke;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("List(" + (i+1) + ") = ");
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1) {
                    System.out.print((j + 1) + " ");

                }
            }
            System.out.println();
        }
    }
}

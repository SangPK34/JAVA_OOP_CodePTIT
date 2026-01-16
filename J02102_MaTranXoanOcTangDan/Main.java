package J02102_MaTranXoanOcTangDan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[]b = new int[n*n];
        int k =0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                a[i][j]=sc.nextInt();
                b[k++]= a[i][j];
            }
        }
        int value = 0;
        Arrays.sort(b);
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            // 1. left -> right
            for (int i = left; i <= right; i++)
                a[top][i] = b[value++];
            top++;

            // 2. top -> bottom
            for (int i = top; i <= bottom; i++)
                a[i][right] = b[value++];
            right--;

            // 3. right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    a[bottom][i] = b[value++];
                bottom--;
            }

            // 4. bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    a[i][left] = b[value++];
                left++;
            }
        }

        for (int[] row : a) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}

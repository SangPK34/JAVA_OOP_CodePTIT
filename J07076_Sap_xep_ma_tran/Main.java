package J07076_Sap_xep_ma_tran;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            int [][] a = new int[n][m];
            int[] b = new int[n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j]=Integer.parseInt(sc.next());
                    if(j==k-1) b[i] = a[i][j];
                }
            }
            Arrays.sort(b);
            for(int i=0; i<n; i++){
                a[i][k-1]=b[i];
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

package J02023_LuaChonThamLam;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if (n != 1 && s == 0 || n * 9 < s) {
            System.out.println("-1 -1");
            return;
        }
        int[] min = new int[n];
        int[] max = new int[n];
        int x =s;
        int y=s;
        
        //min
        for(int i = n-1; i>=0; i--){
            if(x>9){
                min[i] =9;
                x-=9;
            }
            else{
                min[i] = x;
                break;
            }
        }
        if(n>1&&min[0]==0){
            min[0]=1;
            for(int i =1; i<n; i++){
                if(min[i]>0) {
                    min[i]--;
                    break;
                }
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(min[i]);
        }
        System.out.print(" ");
        //max
        for(int i = 0; i<n; i++){
            if(y>9){
                max[i] =9;
                y-=9;
            }
            else{
                max[i] = y;
                break;
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(max[i]);
        }
    }
}

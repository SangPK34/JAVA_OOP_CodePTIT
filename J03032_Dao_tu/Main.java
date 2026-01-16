package J03032_Dao_tu;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine().trim();
            if(s.isEmpty()){
                t++;
                continue;
            }
            String[] A = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String w: A){
                StringBuilder x = new StringBuilder(w);
                sb.append(x.reverse().toString()+" ");
            }
            String kq = sb.toString().trim();
            System.out.println(kq);
        }
    }
}

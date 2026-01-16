package J03031_Xau_Day_Du;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int k = sc.nextInt();
            int cnt =0;
            Map<Character, Integer> mp = new HashMap<>();
            int n = s.length();
            for(int i=0; i<n; i++){
                if(mp.get(s.charAt(i))==null) mp.put(s.charAt(i), 1);
                else cnt++;
            }
            if(mp.size()+k>=26 && n>=26) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

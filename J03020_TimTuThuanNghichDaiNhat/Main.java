package J03020_TimTuThuanNghichDaiNhat;

import java.util.*;
public class Main {
    static boolean tn(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0;
        Map<String, Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.length()>=Max && tn(s)){
                mp.put(s, mp.getOrDefault(s, 0)+1);
                Max = Math.max(Max, s.length());
            }
        }
        final int x = Max;
        mp.forEach((k, v)->{
            if(k.length()==x) System.out.println(k+ " " +v);
        });
    }
}

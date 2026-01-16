package J03030_Bien_Doi_A_B;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;
        s = s.trim();
        int n = s.length();
        if (n == 0) { System.out.println(0); return; }
        long dp0, dp1;
        int bit0 = (s.charAt(0) == 'B') ? 1 : 0;
        dp0 = bit0;   
        dp1 = 1 - bit0;  
        for (int i = 1; i < n; i++) {
            int bit = (s.charAt(i) == 'B') ? 1 : 0;
            long m0 = bit;   
            long m1 = 1 - bit;  
            long ndp0 = m0 + Math.min(dp0, dp1 + 1); 
            long ndp1 = m1 + Math.min(dp0 + 1, dp1); 
            dp0 = ndp0;
            dp1 = ndp1;
        }
        long ans = Math.min(dp0, dp1 + 1);
        System.out.println(ans);
    }
}

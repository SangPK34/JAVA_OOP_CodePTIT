package J02007_Dem_so_lan_xuat_hien;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int T = 1; T <= t; T++) {
            System.out.println("Test " + T + ":");
            int n = sc.nextInt();
            Map<Integer, Integer> mp = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            for(Map.Entry<Integer, Integer> e : mp.entrySet()){
                System.out.println(e.getKey() +" xuat hien " + e.getValue() + " lan");
            }
        }
    }

}

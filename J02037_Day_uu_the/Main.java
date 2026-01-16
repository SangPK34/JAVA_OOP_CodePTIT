package J02037_Day_uu_the;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                t++;
                continue;
            }
            
            String[] a = line.split("\\s+");
            int n = a.length;
            int Le = 0, Chan = 0;
            
            for (String s : a) {
                int x = Integer.parseInt(s);
                if (x % 2 == 0) Chan++;
                else Le++;
            }

            if (n % 2 == 0 && Chan > Le) System.out.println("YES");
            else if (n % 2 == 1 && Le > Chan) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

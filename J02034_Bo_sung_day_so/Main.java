package J02034_Bo_sung_day_so;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ok=0, max=-1;
        Set<Integer> A = new HashSet<>();

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            A.add(x);
            max = Math.max(max, x);
        }
        for(int i =1; i<=max; i++){
            if(!A.contains(i)){
                System.out.println(i);
                ok=1;
            }
        }
        if(ok==0) System.out.println("Excellent!");
    }

}

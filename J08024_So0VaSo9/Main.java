package J08024_So0VaSo9;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(true){
                String s = q.poll();
                long x = Long.parseLong(s);
                if(x%n==0){
                    System.out.println(s);
                    break;
                }
                q.add(s+"0");
                q.add(s+"9");
            }
        }
    }
}

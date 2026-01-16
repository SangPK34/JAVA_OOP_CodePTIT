package JKT013_SoLocPhat;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6"); q.add("8");
            ArrayList<String> A = new ArrayList<>();
            while(true){
                String s = q.poll();
                if(s.length()>n) break;
                else A.add(s);
                q.add(s+"6");
                q.add(s+"8");
            }
            System.out.println(A.size());
            A.sort((a, b) -> {
                if(a.length()!=b.length()) return b.length()-a.length();
                return b.compareTo(a);
            });
            for(String e: A) {
                System.out.print(e+" "); 
            }
            System.out.println();
        }
    }
}

package J03007_So_dep_2;
import java.util.*;
public class Main {
    
    static String check(String s){
        int n = s.length();
        if(s.charAt(0)!='8' || s.charAt(n-1)!='8') return("NO");
        int A=0;
        for(int i=0; i<n;i++){
            char x = s.charAt(i);
            char y = s.charAt(n-i-1);
            if(x!=y) return("NO");
            A+=s.charAt(i)-'0';
        }
        if(A%10==0) return("YES");
        return("NO");
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}

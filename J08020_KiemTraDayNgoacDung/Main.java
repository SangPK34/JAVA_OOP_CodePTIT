package J08020_KiemTraDayNgoacDung;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<Character> st = new Stack<>();
            String s = sc.next();
            int n = s.length();
            for(int i=0; i<n; i++){
                if(st.isEmpty()) st.push(s.charAt(i));
                else{
                    if(st.peek()=='[' && s.charAt(i)==']' || st.peek()=='(' && s.charAt(i)==')' || st.peek()=='{' && s.charAt(i)=='}' ) st.pop();
                    else st.push(s.charAt(i));
                }
            }
            if(st.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
            
    }
}

package J03027_Rut_gon_xau_ky_tu;


import java.util.*;
public class Main {
    
    static String cut(String s){
        int n= s.length();
        Stack<Character> st = new Stack<>();
        for(int i =0; i<n; i++){
            if(!st.empty() && st.peek() == s.charAt(i)) st.pop();
            else st.push(s.charAt(i));
        }
        if(st.empty()) return "Empty String";
        StringBuilder res = new StringBuilder();
        for(char c: st) res.append(c);
        return res.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while(t-- >0){
            String s = sc.next();
            System.out.println(cut(s));
//        }
    }
}

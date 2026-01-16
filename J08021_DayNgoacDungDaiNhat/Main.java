package J08021_DayNgoacDungDaiNhat;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s  = sc.next();
            int n = s.length();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int kq = 0;
            for(int i =0; i<n; i++){
                if(s.charAt(i)=='(') st.push(i);
                else{
                    st.pop();
                    if(st.isEmpty()) st.push(i);
                    else kq= Math.max(kq, i-st.peek());
                }
            }
            System.out.println(kq);
        }
    }
}

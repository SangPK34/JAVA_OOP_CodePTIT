package J08022_PhanTuBenPhaiDauTienLonHon;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i =0; i<n; i++) a[i] = sc.nextLong();
            long[] res = new long[n];
            Stack<Long> st = new Stack<>();
            for(int i =n-1; i>=0; i--){
                while(!st.isEmpty() && st.peek()<= a[i]){
                    st.pop();
                }
                if(!st.isEmpty()) res[i] = st.peek();
                else res[i] = -1;
                st.push(a[i]);
            }
            for(int i =0; i<n; i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

package JKT014_DauTuChungKhoan;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] res = new int[n];
            for(int i =0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i =0; i<n; i++){
                while(!st.isEmpty() && a[st.peek()] <= a[i]){
                    st.pop();
                }
                if(st.isEmpty()) res[i]=i+1;
                else res[i] = i-st.peek();
                st.push(i);
            }
            for(int x: res){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

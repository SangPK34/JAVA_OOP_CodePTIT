package J02017_Thu_gon_day_so;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(st.isEmpty()) st.push(x);
            else if((x%2==0) && (st.peek()%2==0) || (x%2!=0) && (st.peek()%2!=0)) st.pop();
            else st.push(x);
        }
        System.out.println(st.size());
    }
}

package J02009_XepHang;


import java.util.*;

class pair{
    int k,v;

    public pair(int k, int v) {
        this.k = k;
        this.v = v;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        int n = sc.nextInt();
        pair[] A = new pair[n];
        for(int i=0; i<n; i++){
            A[i]= new pair(sc.nextInt(), sc.nextInt());
        }
        
        Arrays.sort(A,(p1,p2) -> {
            return p1.k-p2.k;
        });
        
        for(int i =1; i<n; i++){
            if(A[i].k <= A[i-1].k+ A[i-1].v) {
                A[i].k=A[i-1].k+ A[i-1].v;
            }
        }
        System.out.println( A[n-1].k + A[n-1].v);
    }
}

package J03016_ChiaHetCho11;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            BigInteger A = new BigInteger(a);
            if(A.mod(new BigInteger("11")).equals(new BigInteger("0"))) System.out.println("1");
            else System.out.println("0");
        }
    }
}

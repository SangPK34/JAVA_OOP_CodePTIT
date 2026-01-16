package J03004_Chuan_hoa_xau_ho_ten_2;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {
    public static String chuanhoa(String s){
        s= s.trim().toLowerCase();
        String[] A = s.split("\\s+");
        String a = A[0].toUpperCase();
        StringBuilder res = new StringBuilder();
        for( int i=1; i<A.length; i++ ){
            res.append(Character.toUpperCase(A[i].charAt(0)));
            res.append(A[i].substring(1));
            res.append(" ");
        }
        s= res.toString().trim()+", "+a;
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(s.isEmpty()){
                t++;
                continue;
            }
            System.out.println(chuanhoa(s));
        }
    }
}

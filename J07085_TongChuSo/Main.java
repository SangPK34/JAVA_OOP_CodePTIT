
import java.io.*;
import java.util.*;
public class Main {
    
    static String nhat(String s){
        int n = s.length();
        StringBuilder a = new StringBuilder();

        int l=0, r= 0;
        for(int i =0; i<n; i++){
            if(s.charAt(i)>= '0' && s.charAt(i) <='9') {
                l=i; r=i;
                while(i+1<n && s.charAt(i+1)>= '0' && s.charAt(i+1) <='9'){
                    i++;
                    r=i;
                }
                a.append(s.substring(l, r+1));
            }
        }
        return a.toString();
    } 
    
static int tong(String s){
    int A = 0;
    for (int i = 0; i < s.length(); i++) {
        A += s.charAt(i) - '0';
    }
    return A;
}
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream F = new ObjectInputStream( new BufferedInputStream(new FileInputStream("DATA.in")));
        ArrayList<String> A = (ArrayList<String>) F.readObject();

        for (String e : A) {
            String a = nhat(e).replaceFirst("^0+(?!$)", "");
            System.out.println(a + " " + tong(a));
        }
    }
}

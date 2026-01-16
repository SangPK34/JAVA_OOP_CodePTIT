package J07032_So_thuan_nghich_trong_file;

import java.util.*;
import java.io.*;
public class Main {
    static final int max = 1000000;
    static boolean check(int x){
        String s = String.valueOf(x);
        int n = s.length();
        if(n<2 || n % 2 ==0) return false;
        for(int i=0; i<(n+1)/2; i++) {
            int l = i, r = n-1-i;
            if((s.charAt(l)-'0')%2==0 || (s.charAt(r)-'0')%2==0 || (s.charAt(l)-'0') != (s.charAt(r)-'0')) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream F1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ObjectInputStream F2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList<Integer> A1 = (ArrayList<Integer>) F1.readObject();
        ArrayList<Integer> A2 = (ArrayList<Integer>) F2.readObject();
        int[] in1 = new int[max+1];
        int[] in2 = new int[max+1];
        for(int x: A1) in1[x]++;
        for(int x: A2) in2[x]++;
        int cnt=0;
        for(int i=0; i<=max; i++){
            if(cnt==10) break;
            if(in1[i]>0 && in2[i]>0 && check(i)) {
                System.out.println(i + " " + (in1[i] + in2[i]));
                cnt++;
            }
        }
    }
}

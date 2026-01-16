package J07029_So_nguyen_to_lon_nhat_trong_file;

import java.util.*;
import java.io.*;
public class Main {
    static boolean[] snt = new boolean[1000005];
    static void sang (){
        int n = snt.length;
        Arrays.fill(snt, 2, n, true);
        for(int i =2; i*i<=n; i++){
            if(snt[i]) for(int j=i*i; j<n; j+=i){
                snt[j] = false;
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        sang();
        ObjectInputStream F = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
        ArrayList<Integer> list = (ArrayList<Integer>) F.readObject();
        list.sort((a, b) -> {
            return b.compareTo(a);
        });
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int x: list){
            if(snt[x]){
                if(mp.get(x)==null) mp.put(x, 1);
                else mp.put(x, mp.get(x)+1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> A = new ArrayList<>(mp.entrySet());
        for(int i=A.size()-1; i>=A.size()-10; i--){
            Map.Entry<Integer, Integer> x = A.get(i);
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}

package J07015_So_nguyen_to_trong_file_nhi_phan;

import java.util.*;
import java.io.*;
public class Main {
    static boolean[] snt = new boolean[10005];
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
        ObjectInputStream F = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SONGUYEN.in")));
        ArrayList<Integer> list =(ArrayList<Integer>) F.readObject();
        Map<Integer, Integer> mp = new TreeMap();
        sang();
        list.forEach(x -> {
            if(snt[x]) mp.put(x, mp.getOrDefault(x, 0)+1);
        });
        mp.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}

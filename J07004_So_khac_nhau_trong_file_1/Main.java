package J07004_So_khac_nhau_trong_file_1;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            Map<Integer, Integer> mp = new TreeMap<>();
            while(sc.hasNext()){
                int n= sc.nextInt();
                mp.put(n, mp.getOrDefault(n, 0) + 1);
            }
            for(Map.Entry<Integer, Integer> e : mp.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        } catch (FileNotFoundException e) {
        }
    }
}

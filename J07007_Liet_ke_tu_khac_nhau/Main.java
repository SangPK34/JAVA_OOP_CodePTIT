package J07007_Liet_ke_tu_khac_nhau;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String s  = sc.next().toLowerCase();
            set.add(s);
        }
        set.forEach(w ->{
            System.out.println(w);
        });
    }
}

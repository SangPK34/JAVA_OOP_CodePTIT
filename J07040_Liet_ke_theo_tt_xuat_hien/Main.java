package J07040_Liet_ke_theo_tt_xuat_hien;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream F = new ObjectInputStream (new BufferedInputStream(new FileInputStream("NHIPHAN.in")));
        Set<String> a = new HashSet<>();
        Set<String> b = new LinkedHashSet<>();
        ArrayList<String> A = (ArrayList<String>) F.readObject();
        for(String w: A) {
            String [] arr = w.trim().toLowerCase().split("\\s+");
            for(String e: arr) if(!e.isEmpty()) a.add(e);
        }
        while(sc.hasNext()){
            b.add(sc.next().toLowerCase());
        }
        b.retainAll(a);
        for(String e: b){
            System.out.println(e);
        }
    }
}

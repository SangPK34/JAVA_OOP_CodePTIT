package J07041_Liet_Ke_Cap_So_1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) o.readObject();
        Collections.sort(a);
        HashSet<String> h = new HashSet<>();
        for(Pair i:a){
            if(i.getFirst() < i.getSecond() && !h.contains(i.toString())){
                h.add(i.toString());
                System.out.println(i);
            }
        }
    }
}

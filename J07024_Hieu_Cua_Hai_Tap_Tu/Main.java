package J07024_Hieu_Cua_Hai_Tap_Tu;
import java.util.*;
import java.io.*;

class WordSet{
    TreeSet<String> set= new TreeSet<>();
    public WordSet(String s) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    public String difference(WordSet s2){
        TreeSet<String> phu = new TreeSet<>(this.set);
        phu.removeAll(s2.set);
        StringBuilder sb = new StringBuilder();
        for(String w: phu){
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

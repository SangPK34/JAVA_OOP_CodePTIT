package J04022_Wordset;

import java.util.*;

class WordSet{
    String s;

    public WordSet(String s) {
        this.s = s;
    }
    public String union(WordSet s2){
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        for(String w: this.s.trim().toLowerCase().split("\\s+")){
            set1.add(w);
        }
        for(String w: s2.s.trim().toLowerCase().split("\\s+")){
            set2.add(w);
        }
        TreeSet<String> set3 = new TreeSet<>(set1);
        set3.addAll(set2);
        StringBuilder sb = new StringBuilder();
        for(String w: set3){
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
    public String intersection(WordSet s2){
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        for(String w: this.s.trim().toLowerCase().split("\\s+")){
            set1.add(w);
        }
        for(String w: s2.s.trim().toLowerCase().split("\\s+")){
            set2.add(w);
        }
        TreeSet<String> set3 = new TreeSet<>(set1);
        set3.retainAll(set2);
        StringBuilder sb = new StringBuilder();
        for(String w: set3){
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

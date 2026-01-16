package J07022_Loai_bo_so_nguyen;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Main {
    static boolean checkint(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String x = sc.next();
            if(!checkint(x)) list.add(x);
        }
        list.sort((a, b) ->{
            return a.compareTo(b);
        });
        for(String w: list){
            System.out.print(w+" ");
        }
        sc.close();
    }
}

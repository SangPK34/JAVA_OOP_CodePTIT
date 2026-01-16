package J07021_Chuan_hoa_xau_ho_ten_trong_file;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine().trim().toLowerCase();
            if(s.equals("end")) return;
            String[] A = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String w: A){
               sb.append(Character.toUpperCase(w.charAt(0)));
               if(w.length()>1) sb.append(w.substring(1)+" ");          
            }
            System.out.println(sb.toString().trim());
        }
    }
}

package J03022_XuLyVanBan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String Line = sc.nextLine();
            if (Line.trim().isEmpty()) break;
            sb.append(Line+" ");
        }
        String[] A = sb.toString().trim().toLowerCase().split("[!.?]");
        for(String s: A){
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            System.out.println(s);
        }
    }
}

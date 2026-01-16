package J07005_So_khac_nhau_trong_file_2;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            DataInputStream F = new DataInputStream(new FileInputStream("DATA.IN"));
            TreeMap<Integer, Integer> a = new TreeMap<>();
            for (int i = 0; i < 100000; i++) {
                int x = F.readInt();
                if (a.get(x) == null) {
                    a.put(x, 1);
                } else {
                    a.put(x, a.get(x) + 1);
                }
            }
            a.forEach((k, v) -> {
                System.out.printf("%d %d\n", k, v);
            });
        } catch (FileNotFoundException e) {
        } catch (IOException e){}
    }
}

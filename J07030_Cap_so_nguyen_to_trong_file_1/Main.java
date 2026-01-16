package J07030_Cap_so_nguyen_to_trong_file_1;

import java.util.*;
import java.io.*;

public class Main {
    static final int MAX = 1000000;
    static boolean[] snt = new boolean[MAX + 1];

    static void sang() {
        Arrays.fill(snt, true);
        snt[0] = snt[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (snt[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    snt[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sang();

        ObjectInputStream F1 = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("DATA1.in")));
        ObjectInputStream F2 = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("DATA2.in")));

        ArrayList<Integer> A1 = (ArrayList<Integer>) F1.readObject();
        ArrayList<Integer> A2 = (ArrayList<Integer>) F2.readObject();

        boolean[] in1 = new boolean[MAX + 1];
        boolean[] in2 = new boolean[MAX + 1];

        for (int x : A1) if (x <= MAX) in1[x] = true;
        for (int x : A2) if (x <= MAX) in2[x] = true;

        for (int n = 2; n <= MAX / 2; n++) {
            int m = MAX - n;
            if (snt[n] && snt[m] && in1[n] && in2[m]) {
                System.out.println(n + " " + m);
            }
        }
    }
}

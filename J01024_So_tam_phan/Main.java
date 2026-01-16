/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01024_So_tam_phan;

/**
 *
 * @author Sang
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        run:
        while (t-- > 0) {
            String s = sc.next();

            if (!s.matches("[012]+")) {
                System.out.println("NO");
                continue run;
            }

            System.out.println("YES");
        }
    }
}


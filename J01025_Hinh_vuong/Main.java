/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J01025_Hinh_vuong;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();

        int minX = Math.min(x1, x3);
        int maxX = Math.max(x2, x4);
        int minY = Math.min(y1, y3);
        int maxY = Math.max(y2, y4);

        int width = maxX - minX;
        int height = maxY - minY;

        int side = Math.max(width, height);

        System.out.println(side * side);
    }
}

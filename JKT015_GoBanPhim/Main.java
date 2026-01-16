package JKT015_GoBanPhim;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                if (!st1.isEmpty()) {
                    st2.push(st1.peek());
                    st1.pop();
                }
            } else if (s.charAt(i) == '>') {
                if (!st2.isEmpty()) {
                    st1.push(st2.peek());
                    st2.pop();
                }
            } else if (s.charAt(i) == '-') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(s.charAt(i));
            }
        }
        for (Character e : st1) {
            System.out.print(e);
        }
        while (!st2.isEmpty()) {
            System.out.print(st2.pop());
        }

    }
}

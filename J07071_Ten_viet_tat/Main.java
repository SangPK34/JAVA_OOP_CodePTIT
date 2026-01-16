package J07071_Ten_viet_tat;

import java.util.*;
import java.io.*;

class NAME{
    String hoten, vt, ten, ho;

    public NAME(String hoten) {
        this.hoten = hoten;
        String[] A = hoten.toUpperCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<A.length; i++){
            sb.append(A[i].charAt(0));
            if(i!=A.length-1) sb.append(".");
        }
        this.vt = sb.toString();
        this.ten= A[A.length-1];
        this.ho = String.join(" ", Arrays.copyOf(A, A.length-1));
    }

    @Override
    public String toString() {
        return hoten;
    }
    
}

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner (new File("DANHSACH.in"));
        int n= Integer.parseInt(sc.nextLine());
        ArrayList<NAME> A = new ArrayList<>();
        for(int i=0; i<n; i++){
            A.add(new NAME(sc.nextLine()));
        }
        A.sort((a, b) -> {
            if(!a.ten.equals(b.ten)) return a.ten.compareTo(b.ten);
            else return a.ho.compareTo(b.ho);
        });
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
     run:    for (NAME e : A) {
                if(e.vt.length() == s.length()){
                    int ok=1;
                    for(int i =0; i<s.length(); i++){
                        if(s.charAt(i)=='*') continue;
                        if(s.charAt(i) != e.vt.charAt(i)) {
                            ok=0;
                            break;
                        }
                    }
                    if(ok==1) System.out.println(e);
                }
            }
        }
    }
}

package J03037_Vong_Tron;

import java.util.*;

class chu{
    char c;
    int f, s;

    public chu(char c, int f, int s) {
        this.c = c;
        this.f = f;
        this.s = s;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s  = sc.next();
        int[] check = new int[26];
        int[] first = new int[26];
        int[] sec = new int[26];
        ArrayList<chu> A = new ArrayList<>();
        for(int i =0; i<52;i++){
            if(check[s.charAt(i) -'A']==0) {
                first[s.charAt(i) -'A']=i;
                check[s.charAt(i) -'A']=1;
            }
            else sec[s.charAt(i) -'A']=i;
        }
        for(int i =0; i<26; i++){
            A.add(new chu((char)('A'+i), first[i], sec[i] ));
        }
        A.sort((a, b) ->{
            return Character.compare(a.c, b.c);
        });
        int cnt=0;
        for(int i =0; i<25;i++){
            for(int j =i+1; j<26;j++){
                if(A.get(i).f < A.get(j).f && A.get(i).s<A.get(j).s && A.get(i).s>A.get(j).f || A.get(j).f < A.get(i).f && A.get(j).s<A.get(i).s && A.get(j).s>A.get(i).f) cnt++;
            }
        }
        System.out.println(cnt);
    }
}

package J05063_Tong_Da_Thuc;
import java.util.*;

class DaThuc{
    TreeMap<Integer, Integer> mp = new TreeMap<>();
    ArrayList<String> lst = new ArrayList<>();
    String dt;
    public DaThuc(String s) {
        String[] A  = s.split("\\s*\\+\\s*");
        for(String w: A){
            String[] p = w.split("\\*x\\^");
            int hs = Integer.parseInt(p[0]);
            int mu = Integer.parseInt(p[1]);
            mp.put(mu, hs);
        }
        mp.forEach((k, v)->{
            StringBuilder sb1 = new StringBuilder();
            sb1.append(v).append("*x^").append(k);
            String x = sb1.toString();
            lst.add(x);
        });
        lst.sort((a, b)->{
            int x = Integer.parseInt(a.substring(a.indexOf("^")+1));
            int y = Integer.parseInt(b.substring(b.indexOf("^")+1));
            return y-x;
        });
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<lst.size(); i++){
            sb.append(lst.get(i));
            if(i!=lst.size()-1) sb.append(" + ");
        }
        dt = sb.toString();
    }
    
    public DaThuc cong(DaThuc q){
        TreeMap<Integer,Integer> res = new TreeMap<>(this.mp);
        ArrayList<String> phu = new ArrayList<>();
        q.mp.forEach((k,v)-> res.put(k, res.getOrDefault(k,0)+v));
        res.forEach((k, v)->{
            String x = v+"*x^"+k;
            phu.add(x);
        });
        phu.sort((a, b)->{
            int x = Integer.parseInt(a.substring(a.indexOf("^")+1));
            int y = Integer.parseInt(b.substring(b.indexOf("^")+1));
            return y-x;
        });
        StringBuilder sb2 = new StringBuilder();
        for(int i =0; i<phu.size(); i++){
            sb2.append(phu.get(i));
            if(i!=phu.size()-1) sb2.append(" + ");
        }
        String z = sb2.toString();
        return new DaThuc(z);
    }
    
    @Override
    public String toString() {
        return dt ;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}

package J05033_Sap_xep_thoi_gian;

import java.util.*;

class time{
    int gio, phut, giay, tong;
    public time(int gio, int phut, int giay){
        this.gio= gio;
        this.phut=phut;
        this.giay=giay;
        this.tong = gio*3600+phut*60+giay;
    }
    public String toString(){
        return gio + " " + phut +" " + giay;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<time> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr.add(new time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        arr.sort((a, b) -> a.tong - b.tong);
        for(time x: arr){
            System.out.println(x);
        }
    }
    
}

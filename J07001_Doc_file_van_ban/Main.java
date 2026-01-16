package J07001_Doc_file_van_ban;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } 
        catch (FileNotFoundException e) {
        }
    }
}
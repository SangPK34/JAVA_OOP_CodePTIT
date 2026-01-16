package hellofile;
import java.io.File;
import java.util.Scanner;

public class HelloFile {

    public static void main(String[] args) throws Exception {
        File f = new File("Hello.txt");
        Scanner sc = new Scanner(f);
        
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

}

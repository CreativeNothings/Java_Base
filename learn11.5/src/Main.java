import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


     String s;
     try(InputStream input = new FileInputStream("C:\\text\\README.txt")){
         s =readAsString(input);
     }
     System.out.println(s);
    }
public static String readAsString(InputStream input) throws IOException {
        int n;
        StringBuilder sb = new StringBuilder();
        while((n=input.read())!=-1){
            sb.append((char)n);
        }
        return sb.toString();
}
}

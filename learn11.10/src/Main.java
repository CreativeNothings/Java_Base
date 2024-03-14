import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

//       //Reader
//        Reader reader = new FileReader("src/readme.txt");
//        for(;;){
//            int n = reader.read();
//            while (n!=-1){
//                break;
//            }
//            System.out.println((char)n);
//        }
//        //reader.close();
        //read(char[] c)来设置缓冲区
        try(Reader reader = new FileReader("src/readme.txt")){
            char[] buffer = new char[10000];
            int n;
            while((n=reader.read(buffer))!=-1){
                System.out.println("read "+n+" chars");
            }
        }
    }
}
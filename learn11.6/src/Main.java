import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

       //OutStream
        OutputStream output  =new FileOutputStream("out/readme.txt");
        output.write(72); // H
        output.write(101); // e
        output.write(108); // l
        output.write(108); // l
        output.write(111); // o
        output.close();
        //同样，再次使用try（recourse）
        try(OutputStream output1 = new FileOutputStream("out/readme.txt")){
            output1.write("Hello!".getBytes("utf-8"));
        }
    }
}
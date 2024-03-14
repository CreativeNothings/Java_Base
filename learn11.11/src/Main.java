import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        try(Writer writer = new CharArrayWriter()){
            writer.write(65);
            writer.write(66);
            writer.write(67);
            System.out.println(writer.toString());

        }
    }
}
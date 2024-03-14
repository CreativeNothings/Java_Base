import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        //InputStream
        InputStream input = new FileInputStream("src/readme.txt");
        for (; ; ) {
            int n = input.read();
            if (n == -1) {
                break;
            }
            System.out.println(n);
        }
        input.close();
        try (InputStream inputStream = new FileInputStream("src/readme.txt")) {
            int n;
            while ((n = inputStream.read()) != -1) {
                System.out.println(n);
            }
        }

    }
}

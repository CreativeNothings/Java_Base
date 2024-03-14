import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        byte[] data = Files.readAllBytes(Paths.get("src/readme.txt"));
    }
}
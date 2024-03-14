import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path p1 = Paths.get(".","project","study");
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
        Path p3 = p1.normalize();
        System.out.println(p3);
        File f = p3.toFile();
        System.out.println(f);
        for(Path p:Paths.get("..").toAbsolutePath()){
            System.out.println(" "+p);
        }
    }
}
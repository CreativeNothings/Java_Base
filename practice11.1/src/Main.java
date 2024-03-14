import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        File f = new File("..");
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getCanonicalPath());
//
//        File f1 = new File("...");
//        System.out.println(f1.getPath());
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.getCanonicalPath());
        pathWalk(f, 2);
    }

    public static void pathWalk(File file, int depth) {
        if(file.exists()){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<depth;i++){
                sb.append(" ");
            }
            System.out.println(sb.toString()+file.getName()+(file.isDirectory() ? "/":""));
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for(File f:files){
                    pathWalk(f,depth+1);
                }
            }
        }
    }
}
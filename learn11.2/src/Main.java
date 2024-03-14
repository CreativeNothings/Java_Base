import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {

        //遍历文件
        File f = new File("C:\\Windows");
        File[] fs1 = f.listFiles();
        printFiles(fs1);
        File[] fs2 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
        printFiles(fs2);
    }
    static void printFiles(File[] files){
        System.out.println("====================");
        if(files!=null){
            for(File f:files){
                System.out.println(f);
            }
        }
        System.out.println("====================");
    }
}
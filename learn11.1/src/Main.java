import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public  class Main {
     public static void main(String[] args) throws IOException {
       //file
         File f = new File("C:\\Windows\\notepad.exe");
         System.out.println(f);
         //规范路径
         File f1 = new File("..");
         System.out.println(f1.getPath());
         System.out.println(f1.getAbsolutePath());
         System.out.println(f1.getCanonicalPath());
         //文件目录
         File ff1 = new File("C:\\Windows");
         System.out.println(ff1.isFile());
         System.out.println(ff1.isDirectory());

         


     }
}



public class Main {
    public static void main(String[] args) {

        //命令行参数
        for (String arg:args){
           if("-version".equals(arg)){
               System.out.println("jdk 1.8");
               break;
           }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        //包、作用域
        //由于Java支持嵌套类，
        // 如果一个类内部还定义了嵌套类，那么，
        // 嵌套类拥有访问private的权限：
        Inner i = new Inner();
        i.hi();

    }
    private static void hello(){
        System.out.println("private hello");
    }
    static class Inner{
        public void hi(){
            Main.hello();
        }
    }
}


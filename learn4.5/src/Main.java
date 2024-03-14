public class Main {
    public static void main(String[] args) {
        //方法重载
        //这种方法名相同，但各自的参数不同，称为方法重载（Overload）。
        //注意：方法重载的返回值类型通常都是相同的。
    }
}
class Hello{
    public void hello(){
        System.out.println("hello world");
    }
    public void hello(String name){
        System.out.println("hello world,"+name);
    }

    public void hello(String name,int age){
        System.out.println("hello world,"+age+"years old "+name);
        
    }
}
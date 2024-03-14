public class Main {
    public static void main(String[] args) {

        //内部类
        //除了能引用Outer实例外，
        // 还有一个额外的“特权”，就是可以修改Outer Class的private字段，

        Outer outer = new Outer("outer");
        Outer.Inner inner = outer.new Inner();
        inner.hello();
    }
}

class Outer{
    private String name;

    Outer(String name){
        this.name = name;
    }

    class Inner{
        void hello(){
            System.out.println("Hello,"+Outer.this.name);
        }
    }
}
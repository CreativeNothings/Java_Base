public class Main {
    public static void main(String[] args) {

       //匿名类（anonymous class）
        Outer outer  = new Outer("outer");
        outer.asynHello();

    }
}

class Outer{
    private String name;

    Outer(String name){
        this.name = name;
    }

    void asynHello(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello,"+Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}
//小结
//Java的内部类可分为Inner Class、Anonymous Class
// 和Static Nested Class三种：

//Inner Class和Anonymous Class本质上是相同的，
// 都必须依附于Outer Class的实例，即隐含地持有Outer.this实例，
// 并拥有Outer Class的private访问权限；

//Static Nested Class是独立类，
// 但拥有Outer Class的private访问权限。
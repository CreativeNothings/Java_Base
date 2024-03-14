import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        //动态代理
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if(method.getName().equals("morning")){
                    System.out.println("Morning !"+args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),new Class[] {Hello.class},handler);
        hello.morning("Bob");
        //class可以实例化，interface不行
//        Hello hello = new HelloWorld();
//        hello.morning("Bob");

    }
}

interface Hello{
    void morning(String name);
}
// class HelloWorld implements Hello{
//    public void morning(String name){
//        System.out.println("Morning !"+name);
//    }
//}
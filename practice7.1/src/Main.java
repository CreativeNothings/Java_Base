import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

       //思考一下如何获取String substring(int, int)方法。
        String s = "Hello World";
        Method m = String.class.getMethod("substring", int.class,int.class);
        String r = (String)m.invoke(s,2,7);
        System.out.println(r);

        Method m1 = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m1.invoke(null,"123456");
        System.out.println(n);
    }
}
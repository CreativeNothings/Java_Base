import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Java的反射API提供了Constructor对象(适用带参数的构造方法)
        Constructor con = Integer.class.getConstructor(int.class);

        Integer n1 = (Integer)con.newInstance(123);
        System.out.println(n1);

        Constructor con1 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) con1.newInstance("456");
        System.out.println(n2);
    }
}
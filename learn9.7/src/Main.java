import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

       // 泛型和反射
//        Class clazz = String.class;
//        String str = (String) clazz.newInstance();
        Class<String> clazz = String.class;
        String str = clazz.newInstance();
        //构造方法Constructor<T>也是泛型：
        Class<Integer> clazz1=Integer.class;
        Constructor<Integer> cons = clazz1.getConstructor(int.class);
        Integer i = cons.newInstance(13);

        //我们可以声明带泛型的数组，但不能用new操作符创建带泛型的数组
        Pair<String>[] ps = null;
        //Pair<String>[] ps1 = new Pair<String>[2];//compile error;
        //以下代码存在类型错误
        Pair[] arr = new Pair[2];
        Pair<String>[] ps2 = (Pair<String>[]) arr;

        ps[0]  =new Pair<String>();
        arr[1] = new Pair<Integer>();
    }
}

class Pair<T>{
    T first;
    T last;
}
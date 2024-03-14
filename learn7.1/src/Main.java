public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //反射
        //无继承关系的数据类型无法赋值
        Class cls = String.class;

        String s = "hello";
        Class cls2 = s.getClass();

        Class cls3 = Class.forName("java.lang.String");

        Class cls4 = String.class;
        String s1 = (String)cls4.newInstance();
    }
}
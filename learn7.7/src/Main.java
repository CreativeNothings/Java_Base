public class Main {
    public static void main(String[] args) {
        //获取父类
        Class i = Integer.class;
        Class n = i.getSuperclass();
        Class o = n.getSuperclass();
//        System.out.println(i);
//        System.out.println(n);
//        System.out.println(o);

        //获取接口
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class c : is) {
            System.out.println(c);
        }

        //继承关系
        Object n1 = Integer.valueOf(123);
        boolean isDouble = n1 instanceof Double;
        boolean isInteger = n1 instanceof Integer;

        Number.class.isAssignableFrom(Integer.class);
    }
}
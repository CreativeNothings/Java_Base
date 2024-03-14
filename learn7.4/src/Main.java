import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

       //利用反射设置字段的值
        Person p = new Person("XiaoMing");
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"xiaohong");
        System.out.println(p.getName());

    }
}

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
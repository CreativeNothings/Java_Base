import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Main {
    public static void main(String[] args) throws Exception {

       //JavaBean
        //若干private实例字段；
        //通过public方法来读写实例字段
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        //introspector:内省器
        for(PropertyDescriptor pd:info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" "+pd.getReadMethod());
            System.out.println(" "+pd.getWriteMethod());
        }
    }
}
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

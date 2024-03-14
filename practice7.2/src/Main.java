import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //利用反射调用方法（遵循多态）
        Method m = Person.class.getMethod("hello");
        m.invoke(new Student());

    }
}
class Person{
    public void hello(){
        System.out.println("Person:Hello");
    }
}

class Student extends Person{
    public void hello(){
        System.out.println("Student:Hello");
    }
}
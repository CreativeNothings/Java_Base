import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //编写equals方法
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.contains("B"));
        System.out.println(list.contains("b"));
        System.out.println(list.indexOf("C"));
        System.out.println(list.indexOf("c"));

    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return this.name.equals(p.name) && this.age == p.age;
        }
        return false;
    }
}
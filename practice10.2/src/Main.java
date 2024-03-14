import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add( new Person("Xiao", "Ming", 18));
        list.add(new Person("Xiao", "Hong", 25));
        list.add(new Person("Bob", "Smith", 20));
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public boolean equals(Object o){
        if(o instanceof Person){
            Person p = (Person)  o;
            return p.firstName.equals(this.firstName)&&p.lastName.equals(this.lastName)&&p.age==this.age;

        }
        return false;
    }
}

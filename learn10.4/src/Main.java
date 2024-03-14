import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //编写Map 的 equals和hashCode
        Map<String,Person> map = new HashMap<>();
        map.put("a",new Person("Xiao Ming"));
        map.put("b",new Person("Xiao Hong"));
        map.put("c",new Person("Xiao Jun"));

//       System.out.println(map.get("a").name);
//       System.out.println(map.get("x"));
        System.out.println(map.get("a").hashCode() & 0xf);
    }
}
class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
    public boolean equals(Object o){
        if(o instanceof Person){
            Person p = (Person) o;
            return p.name.equals(this.name);
        }
        return false;
    }
    public int hashCode(){
        int h=0;
        h=31*h+name.hashCode();
        return h;
    }
}
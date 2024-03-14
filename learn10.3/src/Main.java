import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //map
        Student s = new Student("XiaoMing",99);
        Map<String,Student> map = new HashMap<>();
        map.put("XiaoMing",s);
        Student target = map.get("XiaoMing");

        System.out.println(target == s); // true，同一个实例
        System.out.println(target.score); // 99
        Student another = map.get("Bob"); // 通过另一个key查找
        System.out.println(another); // 未找到返回null
        System.out.println(map.containsKey("XiaoMing"));

        //遍历Map
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("apple",12);
        map1.put("pear",23);
        map1.put("banana",34);
        for(String key:map1.keySet()){
            Integer value = map1.get(key);
            System.out.println("Map<"+key+","+value+">");
        }

        //循环遍历Map对象的entrySet()集合
        for(Map.Entry<String,Integer> entry:map1.entrySet()){
            String key1 = entry.getKey();
            Integer value1 = entry.getValue();
            System.out.println("Map<"+key1+","+value1+">");
        }
    }
}

class Student{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}
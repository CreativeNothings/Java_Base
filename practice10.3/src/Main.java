import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //练习
        //请编写一个根据name查找score的程序，并利用Map充当缓存，以提高查找效率
        List<Student> list = new ArrayList<>();
        list.add(new Student("Bob", 78));
        list.add(new Student("Alice", 85));
        list.add(new Student("Brush", 66));
        list.add(new Student("Newton", 99));
        Students holder = new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");

    }

}
class Students{
    List<Student> list;
    Map<String,Integer> cache;

    public Students(List<Student> list){
        this.list = list;
        this.cache = new HashMap<>();
    }
    int getScore(String name){
        Integer score = this.cache.get(name);
        if(score==null){
            score=FindInList(name);
            if(score!=null){
                this.cache.put(name,score);
            }
        }
        return score==null ? -1: score;
    }
    Integer FindInList(String name){
        for(Student s:this.list){
            if(s.name.equals(name)){
                return s.score;
            }
        }
        return null;
    }
}

class Student{
    public String name;
    public int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

}
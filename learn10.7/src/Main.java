import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //MapTree更细节分析
        Map<Student,Integer> map = new TreeMap<>();
        map.put(new Student("tom",77),2);
        map.put(new Student("lily",89),1);
        map.put(new Student("jack",82),3);
        for (Student key : map.keySet()) {
            System.out.println(key.name);
        }
        System.out.println(map.get(new Student("tom", 77)));

    }
}

class Student implements Comparable<Student> {
    String name;
    int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {//按分数排序:升序
        if(this.score<o.score){
            return 1;
        }else if(this.score==o.score){
            return 0;
        }else {
            //this.score<o.score
            return -1;
        }

    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //泛型接口
        //可以直接对String数组进行排序：
        String[] ss = new String[] { "Orange", "Apple", "Pear" };
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Person[] students = new Person[]{
                new Person("bob",11),
                new Person("mike",37),
                new Person("cook",78),
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

class Person implements Comparable<Person>{
    String name;
    int score;
    public Person(String name,int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name+","+this.score;
    }

    @Override
    public int compareTo(Person other) {
       return other.score-this.score;
       //return this.name.compareTo(other.name);
    }
}
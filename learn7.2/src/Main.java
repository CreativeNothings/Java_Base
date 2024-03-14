public class Main {
    public static void main(String[] args) throws NoSuchFieldException  {


        //访问字段
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        //获取private
        System.out.println(stdClass.getDeclaredField("grade"));

    }
}

class Student extends Person{
    public int score;
    private int grade;

    public Student(String name) {
        super(name);
    }
}

class Person{
    public String name;
    public Person(String name){
        this.name = name;
    }

}
public class Main {
    public static void main(String[] args) {

        //继承
        // 注意：子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
        //用protected修饰的字段可以被子类访问
        //因此，protected关键字可以把字段和方法的访问权限控制在继承树内部
        //super()
        Student s = new Student("Xiao Ming", 12, 89);

    }
}
class Person{
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    protected int score;
    public Student(String name,int age,int score){
        super(name, age);

        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {

       //向上向下转型：instanceof

        Person p = new Person();
        System.out.println(p instanceof Person); // true
        System.out.println(p instanceof Student); // false

        Student s = new Student();
        System.out.println(s instanceof Person); // true
        System.out.println(s instanceof Student); // true

        Student n = null;
        System.out.println(n instanceof Student); // false
    }
}

class Person {
    protected String name;
    protected int age;
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int score;
    public Student(){}
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}

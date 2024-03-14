public class Main {
    public static void main(String[] args) {

        //构造方法
        Person ming = new Person("xiaoming",25);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        //要特别注意的是，如果我们自定义了一个构造方法，
        // 那么，编译器就不再自动创建默认构造方法：
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this(name,18);
    }

    public Person(){
        this("unmamed");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
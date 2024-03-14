public class Main {
    public static void main(String[] args) {

       //接口interface
        //所谓interface，就是比抽象类还要抽象的纯抽象接口，
        // 因为它连字段都不能有。
        // 因为接口定义的所有方法默认都是public abstract的，
        // 所以这两个修饰符不需要写出来
    Person p = new Student("xiaoming");
    p.run();
    }

}

interface Person{
    String getName();
    default void run(){
        System.out.println(getName()+" run");
    }
}

class Student implements Person{
    private String name;
    public  Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
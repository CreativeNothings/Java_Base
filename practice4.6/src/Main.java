public class Main {
    public static void main(String[] args) {

        //练习
        //给Person类增加一个静态字段count和静态方法getCount()，
        // 统计实例创建的个数。
        Person p1 = new Person("p1",19);
        Person p2 = new Person("p2",20);
        System.out.println(Person.getCount());
    }


}

class Person {
    private int age;
    private String name;
    public static int count;
    public static int getCount(){
        return count;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        count++;
    }
}

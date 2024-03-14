public class Main {
    public static void main(String[] args) {

        //静态字段和静态方法static
        //推荐用类名来访问静态字段。可以把静态字段理解为描述class本身的字段
        Person.setNumber(99);
        System.out.println(Person.number);
    }
}

class Person{
    public static int number;

    public static void setNumber(int value){
        number = value;
    }
}
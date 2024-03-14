class Person{
    public String name;
    public int age;
}

class Book{
    public String name;
    public String author;
    public String isbn;
    public double price;

}
public class Main {
    public static void main(String[] args) {
        // 一个Java源文件可以包含多个类的定义，但只能定义一个public类，
        // 且public类名必须与文件名一致。如果要定义多个public类，
        // 必须拆到多个Java源文件中。

        Person Ming = new Person();
        Ming.name = "xiaoming";
        Ming.age = 25;
        System.out.println(Ming.name);

    }
}
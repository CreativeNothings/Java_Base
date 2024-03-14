public class Main {
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }
}

class Person {
    public void run() {
        System.out.println("person run");
    }
}

 class Student extends Person {
    @Override
    public void run() {
        System.out.println("student run");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        //调用方法
        Class cls = Student.class;
        System.out.println(cls.getMethod("getScore", String.class));
        System.out.println(cls.getMethod("getName"));
        System.out.println(cls.getDeclaredMethod("getGrade", int.class));
    }
}

class Student extends Person {
    public int getScore(String type) {
        return 99;
    }
    private int getGrade(int year) {
        return 1;
    }
}

class Person {
    public String getName() {
        return "Person";
    }
}

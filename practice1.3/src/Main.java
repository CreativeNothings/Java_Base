public class Main {
    public static void main(String[] args) {

        //三元运算符
        int n = -100;
        int x = n >=0 ? n:-n;
        System.out.println(x);
        //练习
        //判断指定年龄是否是小学生（6～12岁）：
        int age = 7;
        System.out.println(age>=6&&age<=12 ? "yes":"no");
    }
}